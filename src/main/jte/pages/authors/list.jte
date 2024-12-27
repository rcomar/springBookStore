@import com.rcoyto.springBookStore.authors.Author
@import java.time.format.DateTimeFormatter
@import java.util.List
@import com.rcoyto.springBookStore.commons.PageDetail
@import org.springframework.data.domain.Page

@param Page<Author> responsePage
@param PageDetail pageDetail
@param List<Author> authors

@template.pages.authors.index(pageDetail = pageDetail, list = @`
    @if(authors.isEmpty())
        <p class="m-2">There is no authors</p>
    @else
        <table id="mainTable" class="table table-striped table-bordered">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Birth date</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>

                @for(Author author:authors)
                    <tr>
                        <td>${author.getId()}</td>
                        <td>${author.getName()}</td>
                        <td>${author.getBirthDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))}</td>
                        <td>
                            <button class="btn btn-primary"
                                    hx-get="/authors/${author.getId()}"
                                    hx-target="#author_detail"
                                    type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#modal_author_detail">Details</button>
                        </td>
                    </tr>
                @endfor

            </tbody>
        </table>
        <div>
            <a class="btn btn-primary
            @if(responsePage.isFirst())
                disabled
            @endif"
               href="/authors/?size=5&page=0" hx-boost="true">${"<< Primera"}</a>
            <a class="btn btn-primary
            @if(responsePage.isFirst())
                disabled
            @endif"
               href="/authors/?size=5&page=${responsePage.getPageable().getPageNumber() - 1}" hx-boost="true">${"< Anterior"}
            </a>
            <p class="btn btn-outline-primary disabled" style="display:inline">${responsePage.getPageable().getPageNumber() + 1}</p>
            <a class="btn btn-primary
             @if(responsePage.isLast())
                disabled
            @endif"
               href="/authors/?size=5&page=${responsePage.getPageable().getPageNumber() + 1}" hx-boost="true">${"Siguiente >"}</a>
            <a class="btn btn-primary
            @if(responsePage.isLast())
                disabled
            @endif"
               href="/authors/?size=5&page=${responsePage.getTotalPages() - 1}" hx-boost="true">${"Última >>"}</a>

            <p class="mr-5" style="display:inline">There's ${responsePage.getTotalElements()}
                author@if(responsePage.getTotalElements() > 1)s@endif in total.
        </p>
        </div>
    @endif
`)