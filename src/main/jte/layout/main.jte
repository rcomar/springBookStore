@import com.rcoyto.springBookStore.commons.PageDetail
@import com.rcoyto.springBookStore.commons.PageDetail
@import gg.jte.Content

@param PageDetail pageDetail
@param Content content

<!doctype html>
<html lang="en">
<head>
    @if(pageDetail.getDescription() != null)
        <meta name="description" content="${pageDetail.getDescription()}">
    @endif
    <title>${pageDetail.getTitle()}</title>
    <script src="/js/htmx.min.js"></script>
    <script>if(!window.htmx) document.write('<script src="https://unpkg.com/htmx.org@2.0.4"><\/script>');</script>
</head>
<body class="d-flex flex-column min-vh-100">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/" hx-boost="true">BookStore</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="/books/?size=5" hx-boost="true">Books</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Dropdown
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <!--<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>-->
            </form>
        </div>
    </div>
</nav>

    <main class="flex-grow-1 pb-3 px-2">
        <h1>${pageDetail.getTitle()}</h1>
        ${content}
    </main>


<!-- Footer -->
<footer class="bg-dark text-white text-center py-3 mt-auto">
    &copy; ${java.time.LocalDate.now().getYear()} Book List - Todos los derechos reservados.
</footer>


</body>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</html>