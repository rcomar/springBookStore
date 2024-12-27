@import com.rcoyto.springBookStore.authors.AuthorDataDTO
@import java.util.List

@param List<AuthorDataDTO> authorsData

<label>
    Authors
    <select  class="form-control" required name="authorsSelect"
            _="on change call addToList(me.value) ">
        <option value="">Select an option...</option>
        @for(AuthorDataDTO data: authorsData)
            <option id="author${data.getId()}" value="${data.getId()}">${data.getName()}</option>
        @endfor
    </select>
</label>
<!-- Visible list of selected authors -->
<select name="authors" id="selectedAuthorsList">

</select>
@raw
    <script type="text/hyperscript">
        def addToList(authorId)
            if authorId != ""
                log authorId
                js(authorId)
                  var optionText = document.getElementById('author' + authorId).innerHTML
                  console.log(optionText)
                  var ul = document.getElementById("selectedAuthorsList");
                  var li = document.createElement("option");
                  li.setAttribute("selected", "selected");
                  ul.appendChild(li);
                  return optionText
                end
                then put authorId into the last <option/>
            end
        end
    </script>
@endraw
