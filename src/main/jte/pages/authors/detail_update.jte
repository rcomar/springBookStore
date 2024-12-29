@import com.rcoyto.springBookStore.authors.Author
@import java.time.format.DateTimeFormatter

@param Author author

<form class="form">
    <div class="row mb-3">
        <label>Id
            <input disabled class="form-control" type="text" placeholder="Id" name="id" value="${author.getId()}">
        </label>
        <label>Name
            <input class="form-control" type="text" placeholder="Name" name="name" value="${author.getName()}">
        </label>

        <label>Birth date
            <input class="form-control" type="date" placeholder="Birth date" name="birthDate" value="${author.getBirthDate().format(DateTimeFormatter.ISO_LOCAL_DATE)}">
        </label>
        <input hx-put="/authors/" type="button" value="Update" class="btn btn-primary mt-3">
    </div>
</form>