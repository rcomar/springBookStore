package gg.jte.generated.ondemand.pages.books;
import com.rcoyto.springBookStore.commons.PageDetail;
import gg.jte.Content;
public final class JteindexGenerated {
	public static final String JTE_NAME = "pages/books/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,7,7,7,7,13,13,13,14,31,31,31,31,31,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, PageDetail pageDetail, Content list, Content detail) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, pageDetail, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <div class=\"flex\">\r\n    <button hx-get=\"/books/0\" hx-target=\"#book_detail\" type=\"button\" class=\"btn btn-success inline\" data-bs-toggle=\"modal\" data-bs-target=\"#modal_book_detail\"> + New Book</button>\r\n    </div>\r\n\r\n    <div>");
				jteOutput.setContext("div", null);
				jteOutput.writeUserContent(list);
				jteOutput.writeContent("</div>\r\n    ");
				jteOutput.writeContent("\r\n    <div class=\"modal fade\" id=\"modal_book_detail\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n        <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\">\r\n            <div class=\"modal-content\">\r\n                <div class=\"modal-header\">\r\n                    <h1 class=\"modal-title fs-5\" id=\"staticBackdropLabel\">Modal title</h1>\r\n                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n                </div>\r\n                <div class=\"modal-body\">\r\n                    <div id=\"book_detail\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		PageDetail pageDetail = (PageDetail)params.get("pageDetail");
		Content list = (Content)params.getOrDefault("list", null);
		Content detail = (Content)params.getOrDefault("detail", null);
		render(jteOutput, jteHtmlInterceptor, pageDetail, list, detail);
	}
}
