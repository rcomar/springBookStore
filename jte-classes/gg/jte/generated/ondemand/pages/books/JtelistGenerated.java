package gg.jte.generated.ondemand.pages.books;
import com.rcoyto.springBookStore.books.Book;
import java.util.List;
import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.data.domain.Page;
public final class JtelistGenerated {
	public static final String JTE_NAME = "pages/books/list.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,15,15,15,15,30,30,41,41,42,42,44,44,44,45,45,45,46,46,46,47,47,47,48,48,48,49,49,49,50,50,50,54,54,54,54,59,59,59,59,60,60,60,60,64,64,65,65,70,70,72,72,73,73,73,75,75,77,77,78,78,78,78,78,78,78,80,80,80,82,82,84,84,85,85,85,85,85,85,85,87,87,89,89,90,90,90,90,90,90,90,92,92,92,95,95,95,95,95,5,6,7,8,9,10,11,12,13,13,13,13};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, int size, int currentPage, int previousPage, int totalPages, boolean isFirst, boolean isLast, Page<Book> responsePage, PageDetail pageDetail, List<Book> books) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.pages.books.JteindexGenerated.render(jteOutput, jteHtmlInterceptor, pageDetail, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n<table id=\"mainTable\" class=\"table table-striped table-bordered\">\r\n    <thead>\r\n    <tr>\r\n        <th>Isbn</th>\r\n        <th>Title</th>\r\n        <th>Nr. of pages</th>\r\n        <th>Genre</th>\r\n        <th>Publisher</th>\r\n        <th>Language</th>\r\n        <th>Cover</th>\r\n        <th>Actions</th>\r\n    </tr>\r\n    </thead>\r\n    <tbody>\r\n    ");
				if (books.isEmpty()) {
					jteOutput.writeContent("\r\n        <tr>\r\n            <td></td>\r\n            <td></td>\r\n            <td></td>\r\n            <td></td>\r\n            <td>There is no books</td>\r\n            <td></td>\r\n            <td></td>\r\n            <td></td>\r\n        </tr>\r\n    ");
				} else {
					jteOutput.writeContent("\r\n        ");
					for (Book book:books) {
						jteOutput.writeContent("\r\n            <tr>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getIsbn());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getTitle());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getPages());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getGenre().getValue());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getPublisher().getValue());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getLanguage().getValue());
						jteOutput.writeContent("</td>\r\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(book.getCover().getValue());
						jteOutput.writeContent("</td>\r\n\r\n                <td>\r\n                    <button class=\"btn btn-primary\"\r\n                            hx-get=\"/books/");
						jteOutput.setContext("button", "hx-get");
						jteOutput.writeUserContent(book.getIsbn());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("\"\r\n                            hx-target=\"#book_detail\"\r\n                            type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#modal_book_detail\">Details</button>\r\n\r\n                    <button class=\"btn btn-danger\"\r\n                            hx-delete=\"/books/");
						jteOutput.setContext("button", "hx-delete");
						jteOutput.writeUserContent(book.getIsbn());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("\"\r\n                            hx-confirm=\"Are you sure you wish to deactivate the book ");
						jteOutput.setContext("button", "hx-confirm");
						jteOutput.writeUserContent(book.getTitle());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("?\">\r\n                        Deactivate</button>\r\n                </td>\r\n            </tr>\r\n        ");
					}
					jteOutput.writeContent("\r\n    ");
				}
				jteOutput.writeContent("\r\n    </tbody>\r\n</table>\r\n    <div>\r\n        <a class=\"btn btn-primary\r\n        ");
				if (responsePage.isFirst()) {
					jteOutput.writeContent("\r\n            disabled\r\n        ");
				}
				jteOutput.writeContent("\"\r\n           href=\"/books/?size=5&page=0\" hx-boost=\"true\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent("<< Primera");
				jteOutput.writeContent("</a>\r\n        <a class=\"btn btn-primary\r\n        ");
				if (responsePage.isFirst()) {
					jteOutput.writeContent("\r\n            disabled\r\n        ");
				}
				jteOutput.writeContent("\"\r\n           href=\"/books/?size=5&page=");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(responsePage.getPageable().getPageNumber() - 1);
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\" hx-boost=\"true\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent("< Anterior");
				jteOutput.writeContent("\r\n            </a>\r\n        <p class=\"btn btn-outline-primary disabled\" style=\"display:inline\">");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(responsePage.getPageable().getPageNumber() + 1);
				jteOutput.writeContent("</p>\r\n        <a class=\"btn btn-primary\r\n         ");
				if (responsePage.isLast()) {
					jteOutput.writeContent("\r\n            disabled\r\n        ");
				}
				jteOutput.writeContent("\"\r\n            href=\"/books/?size=5&page=");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(responsePage.getPageable().getPageNumber() + 1);
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\" hx-boost=\"true\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent("Siguiente >");
				jteOutput.writeContent("</a>\r\n        <a class=\"btn btn-primary\r\n        ");
				if (responsePage.isLast()) {
					jteOutput.writeContent("\r\n            disabled\r\n        ");
				}
				jteOutput.writeContent("\"\r\n           href=\"/books/?size=5&page=");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(responsePage.getTotalPages() - 1);
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\" hx-boost=\"true\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent("Última >>");
				jteOutput.writeContent("</a>\r\n\r\n        <p class=\"mr-5\" style=\"display:inline\">There's ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(responsePage.getTotalElements());
				jteOutput.writeContent(" books in total.</p>\r\n    </div>\r\n\r\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		int size = (int)params.get("size");
		int currentPage = (int)params.get("currentPage");
		int previousPage = (int)params.get("previousPage");
		int totalPages = (int)params.get("totalPages");
		boolean isFirst = (boolean)params.get("isFirst");
		boolean isLast = (boolean)params.get("isLast");
		Page<Book> responsePage = (Page<Book>)params.get("responsePage");
		PageDetail pageDetail = (PageDetail)params.get("pageDetail");
		List<Book> books = (List<Book>)params.get("books");
		render(jteOutput, jteHtmlInterceptor, size, currentPage, previousPage, totalPages, isFirst, isLast, responsePage, pageDetail, books);
	}
}
