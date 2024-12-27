@import com.rcoyto.springBookStore.authors.Author

@param Author author

<form class="form">
    <div class="row mb-3">
        <label>Title
            <input class="form-control" type="text" required placeholder="Name" name="name">
        </label>
        <label>Title
            <input class="form-control" type="date" required placeholder="Birth date" name="birthDate">
        </label>

        <input hx-post="/authors/" type="button" value="Add" class="btn btn-primary mt-3">
    </div>
</form>

