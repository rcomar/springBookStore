package gg.jte.generated.ondemand.layout;
import com.rcoyto.springBookStore.commons.PageDetail;
import com.rcoyto.springBookStore.commons.PageDetail;
import gg.jte.Content;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,10,10,10,11,11,11,11,11,11,11,11,11,12,12,13,13,13,54,54,54,55,55,55,61,61,61,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, PageDetail pageDetail, Content content) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    ");
		if (pageDetail.getDescription() != null) {
			jteOutput.writeContent("\r\n        <meta name=\"description\"");
			var __jte_html_attribute_0 = pageDetail.getDescription();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" content=\"");
				jteOutput.setContext("meta", "content");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("meta", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n    ");
		}
		jteOutput.writeContent("\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(pageDetail.getTitle());
		jteOutput.writeContent("</title>\r\n    <script src=\"/js/htmx.min.js\"></script>\r\n    <script>if(!window.htmx) document.write('<script src=\"https://unpkg.com/htmx.org@2.0.4\"><\\/script>');</script>\r\n</head>\r\n<body class=\"m-2\">\r\n\r\n<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n    <div class=\"container-fluid\">\r\n        <a class=\"navbar-brand\" href=\"/\" hx-boost=\"true\">BookStore</a>\r\n        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n            <span class=\"navbar-toggler-icon\"></span>\r\n        </button>\r\n        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n                <li class=\"nav-item\">\r\n                    <a class=\"nav-link\" href=\"/books/?size=5\" hx-boost=\"true\">Books</a>\r\n                </li>\r\n                <li class=\"nav-item dropdown\">\r\n                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n                        Dropdown\r\n                    </a>\r\n                    <ul class=\"dropdown-menu\">\r\n                        <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n                        <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n                        <li><hr class=\"dropdown-divider\"></li>\r\n                        <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n                    </ul>\r\n                </li>\r\n                <li class=\"nav-item\">\r\n                    <a class=\"nav-link disabled\" aria-disabled=\"true\">Disabled</a>\r\n                </li>\r\n            </ul>\r\n            <form class=\"d-flex\" role=\"search\">\r\n                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n            </form>\r\n        </div>\r\n    </div>\r\n</nav>\r\n\r\n\r\n<h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(pageDetail.getTitle());
		jteOutput.writeContent("</h1>\r\n");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</body>\r\n\r\n<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		PageDetail pageDetail = (PageDetail)params.get("pageDetail");
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, pageDetail, content);
	}
}
