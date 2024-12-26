@import com.rcoyto.springBookStore.books.Book
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
            <input class="form-control" type="text" required placeholder="Isbn" name="isbn">
        </label>
        <label>Title
            <input class="form-control" type="text" required placeholder="Title" name="title">
        </label>
        <label>Cover
            <select class="form-control" required name="cover">
                <option value="">Select an option...</option>
                @for(Cover cover: covers)
                    <option value="${cover}">${cover.getValue()}</option>
                @endfor
            </select>
        </label>
        <label>Genre
            <select class="form-control" required name="genre">
                <option value="">Select an option...</option>
                @for(Genre genre: genres)
                    <option value="${genre}">${genre.getValue()}</option>
                @endfor
            </select>
        </label>
        <label>Publisher
            <select class="form-control" required name="publisher">
                <option value="">Select an option...</option>
                @for(Publisher publisher: publishers)
                    <option value="${publisher}">${publisher.getValue()}</option>
                @endfor
            </select>
        </label>
        <label>Language
            <select class="form-control" required name="language">
                <option value="">Select an option...</option>
                @for(Language language: languages)
                    <option value="${language}">${language.getValue()}</option>
                @endfor
            </select>
        </label>
        <label>Pages
            <input class="form-control" type="text" placeholder="pages" name="pages">
        </label>
            <input hx-post="/books/" type="button" value="Add" class="btn btn-primary mt-3">
    </div>
</form>

