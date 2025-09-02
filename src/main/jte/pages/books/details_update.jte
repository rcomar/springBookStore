@import com.rcoyto.springBookStore.books.Book
@import java.time.format.DateTimeFormatter
@import com.rcoyto.springBookStore.books.Cover
@import com.rcoyto.springBookStore.books.Genre
@import com.rcoyto.springBookStore.books.Publisher
@import com.rcoyto.springBookStore.books.Language

@param Cover[] covers
@param Genre[] genres
@param Publisher[] publishers
@param Language[] languages
@param Book book

<form class="form">
    <div class="row mb-3">
        <label>Isbn
            <input class="form-control" type="text" placeholder="Isbn" name="isbn" value="${book.getIsbn()}">
        </label>
        <label>Title
            <input class="form-control" type="text" placeholder="Title" name="title" value="${book.getTitle()}">
        </label>
         <label>Cover
                <select class="form-control"  name="cover">
                    <option value="">Select an option...</option>
                    @for(Cover cover: covers)
                        @if(book.getCover().equals(cover))
                            <option selected="selected" value="${cover}">${cover.getValue()}</option>
                        @else
                            <option value="${cover}">${cover.getValue()}</option>
                        @endif
                    @endfor
                </select>
        </label>
        <label>Genre
            <select class="form-control"  name="genre">
                <option value="">Select an option...</option>
                @for(Genre genre: genres)
                    @if(book.getGenre().equals(genre))
                        <option selected="selected" value="${genre}">${genre.getValue()}</option>
                    @else
                        <option value="${genre}">${genre.getValue()}</option>
                    @endif
                @endfor
            </select>
        </label>
        <label>Publisher
            <select class="form-control"  name="publisher">
                <option value="">Select an option...</option>
                @for(Publisher publisher: publishers)
                    @if(book.getPublisher().equals(publisher))
                        <option selected="selected" value="${publisher}">${publisher.getValue()}</option>
                    @else
                        <option value="${publisher}">${publisher.getValue()}</option>
                    @endif
                @endfor
            </select>
        </label>
        <label>Language
            <select class="form-control"  name="language">
                <option value="">Select an option...</option>
                @for(Language language: languages)
                    @if(book.getLanguage().equals(language))
                        <option selected="selected" value="${language}">${language.getValue()}</option>
                    @else
                        <option value="${language}">${language.getValue()}</option>
                    @endif
                @endfor
            </select>
        </label>

        <label>Pages
            <input class="form-control" type="text" placeholder="pages" name="pages" value="${ book.getPages()}">
        </label>
        @if(book.getDeactivationDate() != null)
        <label>Deactivation date</label>
            <p>${book.getDeactivationDate().format(DateTimeFormatter.BASIC_ISO_DATE)}</p>
        @endif
        <input hx-put="/books/" hx-include="#pagina-actual" type="button" value="Update" class="btn btn-primary mt-3">
    </div>
</form>

