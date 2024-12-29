@import com.rcoyto.springBookStore.books.Book
@import java.util.List
@import com.rcoyto.springBookStore.commons.PageDetail
@import org.springframework.data.domain.Page

@param Page<Book> responsePage
@param PageDetail pageDetail
@param List<Book> books
@param boolean showDeact = false
@template.pages.books.index(pageDetail = pageDetail, list = @`


    <label>Show Deactivated
        <input class="checkbox" type="checkbox" hx-target="body" hx-trigger="change" hx-get="/books/?size=${responsePage.getPageable().getPageSize()}&page=${responsePage.getPageable().getPageNumber()}" name="showDeact" checked="${showDeact}" value="${showDeact}">
    </label>

<table id="mainTable" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>Isbn</th>
        <th>Title</th>
        <th>Genre</th>
        <th>Publisher</th>
        <th>Cover</th>
        <th>Author</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    @if(books.isEmpty())
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>There is no books</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    @else
        @for(Book book:books)
            <tr>
                <td>${book.getIsbn()}</td>
                <td>${book.getTitle()}</td>
                <td>${book.getGenre().getValue()}</td>
                <td>${book.getPublisher().getValue()}</td>
                <td>${book.getCover().getValue()}</td>
                <td>${book.getAuthor().getName()}</td>
                <td>
                    <button class="btn btn-primary"
                            hx-get="/books/${book.getIsbn()}"
                            hx-target="#book_detail"
                            type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#modal_book_detail">Edit</button>

                    <button class="btn btn-danger"
                            hx-delete="/books/${book.getIsbn()}"
                            hx-confirm="Are you sure you wish to deactivate the book ${book.getTitle()}?">
                        Deactivate</button>
                </td>
            </tr>
        @endfor
    @endif
    </tbody>
</table>
    <div>
        <a class="btn btn-primary
        @if(responsePage.isFirst())
            disabled
        @endif"
           href="/books/?showDeact=${showDeact}&size=5&page=0" hx-boost="true">${"<< Primera"}</a>
        <a class="btn btn-primary
        @if(responsePage.isFirst())
            disabled
        @endif"
           href="/books/?showDeact=${showDeact}&size=5&page=${responsePage.getPageable().getPageNumber() - 1}" hx-boost="true">${"< Anterior"}
            </a>
        <p class="btn btn-outline-primary disabled" style="display:inline">${responsePage.getPageable().getPageNumber() + 1}</p>
        <a class="btn btn-primary
         @if(responsePage.isLast())
            disabled
        @endif"
            href="/books/?showDeact=${showDeact}&size=5&page=${responsePage.getPageable().getPageNumber() + 1}" hx-boost="true">${"Siguiente >"}</a>
        <a class="btn btn-primary
        @if(responsePage.isLast())
            disabled
        @endif"
           href="/books/?showDeact=${showDeact}&size=5&page=${responsePage.getTotalPages() - 1}" hx-boost="true">${"Última >>"}</a>

        <p class="mr-5" style="display:inline">There's ${responsePage.getTotalElements()} books in total.</p>
    </div>

`)