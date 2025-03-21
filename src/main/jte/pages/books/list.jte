@import com.rcoyto.springBookStore.books.Book
@import java.util.List
@import com.rcoyto.springBookStore.commons.PageDetail
@import org.springframework.data.domain.Page

@param int size
@param int currentPage
@param int previousPage
@param int totalPages
@param boolean isFirst
@param boolean isLast
@param Page<Book> responsePage
@param PageDetail pageDetail
@param List<Book> books

@template.pages.books.index(pageDetail = pageDetail, list = @`
<table id="mainTable" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th class="d-none d-lg-table-cell">Isbn</th>
        <th>Title</th>
        <th class="d-none d-lg-table-cell">Nr. of pages</th>
        <th>Genre</th>
        <th class="d-none d-lg-table-cell">Publisher</th>
        <th>Language</th>
        <th class="d-none d-lg-table-cell">Cover</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    @if(books.isEmpty())
        <tr>
            <td class="d-none d-lg-table-cell"></td>
            <td></td>
            <td class="d-none d-lg-table-cell"></td>
            <td>There is no books</td>
            <td class="d-none d-lg-table-cell"></td>
            <td></td>
            <td class="d-none d-lg-table-cell"></td>
            <td></td>
        </tr>
    @else
        @for(Book book:books)
            <tr>
                <td class="d-none d-lg-table-cell">${book.getIsbn()}</td>
                <td>${book.getTitle()}</td>
                <td class="d-none d-lg-table-cell">${book.getPages()}</td>
                <td>${book.getGenre().getValue()}</td>
                <td class="d-none d-lg-table-cell">${book.getPublisher().getValue()}</td>
                <td>${book.getLanguage().getValue()}</td>
                <td class="d-none d-lg-table-cell">${book.getCover().getValue()}</td>

                <td>
                    <button class="btn btn-primary"
                            hx-get="/books/${book.getIsbn()}"
                            hx-target="#book_detail"
                            type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#modal_book_detail">Details</button>

                    <button class="btn btn-danger fs-6"
                            hx-delete="/books/${book.getIsbn()}"
                            hx-confirm="Are you sure you wish to disable the book ${book.getTitle()}?">
                        Disable</button>
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
           href="/books/?size=5&page=0" hx-boost="true">${"<< Primera"}</a>
        <a class="btn btn-primary
        @if(responsePage.isFirst())
            disabled
        @endif"
           href="/books/?size=5&page=${responsePage.getPageable().getPageNumber() - 1}" hx-boost="true">${"< Anterior"}
            </a>
        <p class="btn btn-outline-primary disabled" style="display:inline">${responsePage.getPageable().getPageNumber() + 1}</p>
        <a class="btn btn-primary
         @if(responsePage.isLast())
            disabled
        @endif"
            href="/books/?size=5&page=${responsePage.getPageable().getPageNumber() + 1}" hx-boost="true">${"Siguiente >"}</a>
        <a class="btn btn-primary
        @if(responsePage.isLast())
            disabled
        @endif"
           href="/books/?size=5&page=${responsePage.getTotalPages() - 1}" hx-boost="true">${"Última >>"}</a>

        <p class="mr-5" style="display:inline">There's ${responsePage.getTotalElements()} books in total.</p>
    </div>

`)