@import com.rcoyto.springBookStore.commons.PageDetail
@import gg.jte.Content

@param PageDetail pageDetail
@param Content list = null
@param Content detail = null

@template.layout.main(pageDetail = pageDetail, content = @`

    <div class="flex">
        <button hx-get="/authors/0" hx-target="#author_detail" type="button" class="btn btn-success inline" data-bs-toggle="modal" data-bs-target="#modal_author_detail"> + New Author</button>
    </div>

    <div>${list}</div>
    <!-- Modal -->
    <div class="modal fade" id="modal_author_detail" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div id="author_detail"></div>
                </div>
            </div>
        </div>
    </div>



`)