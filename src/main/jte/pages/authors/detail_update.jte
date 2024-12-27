@import com.rcoyto.springBookStore.authors.Author
@import java.time.format.DateTimeFormatter

@param Author author

<form class="form">
    <div class="row mb-3">
        <label>Isbn
            <input class="form-control" type="text" placeholder="Id" name="id" value="${author.getId()}">
        </label>
        <label>Title
            <input class="form-control" type="text" placeholder="Name" name="name" value="${author.getName()}">
        </label>

        <label>Pages
            <input class="form-control" type="date" placeholder="Birth date" name="birth_date" value="${ author.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}">
        </label>
        <input hx-put="/authors/" type="button" value="Update" class="btn btn-primary mt-3">
    </div>
</form>

