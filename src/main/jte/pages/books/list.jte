@import com.rcoyto.springBookStore.books.Book
@import java.util.List
@import com.rcoyto.springBookStore.commons.PageDetail
@import org.springframework.data.domain.Page
@import com.rcoyto.springBookStore.commons.Constants

@param Page<Book> responsePage
@param PageDetail pageDetail
@param List<Book> books

@template.pages.books.index(pageDetail = pageDetail, list = @`
<div>
    <input hidden="hidden" name="pagina-actual" id="pagina-actual" value="${responsePage.getPageable().getPageNumber()}">
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
                                type="button" data-bs-toggle="modal" data-bs-target="#modal_book_detail">Details</button>

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
    <div class="container d-flex flex-wrap justify-content-center gap-2">
        <button class="btn btn-primary
        @if(responsePage.isFirst())
            disabled
        @endif"
           hx-get="/books/?page=0" hx-push-url="true" hx-target="body" hx-scroll="false">${"<< Primera"}</button>
        <button class="btn btn-primary
        @if(responsePage.isFirst())
            disabled
        @endif"
           hx-get="/books/?page=${responsePage.getPageable().getPageNumber() - 1}" hx-push-url="true" hx-target="body" hx-scroll="false">${"< Anterior"}</button>
        <span class="btn btn-outline-primary disabled ">${responsePage.getPageable().getPageNumber() + 1}</span>
        <button class="btn btn-primary
         @if(responsePage.isLast())
            disabled
        @endif"
            hx-get="/books/?page=${responsePage.getPageable().getPageNumber() + 1}" hx-push-url="true" hx-target="body" hx-scroll="false">${"Siguiente >"}</button>
        <button class="btn btn-primary
        @if(responsePage.isLast())
            disabled
        @endif"
           hx-get="/books/?page=${responsePage.getTotalPages() - 1}" hx-push-url="true" hx-target="body" hx-scroll="false">${"Última >>"}</button>
    </div>
</div>
`)