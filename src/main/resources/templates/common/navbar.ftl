
    <img class="img-responsive" src="/images/myBanner.png" alt="banner"/>
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" th:href="@{/user}">Главная</a>   <!--@{/front}-->
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse  navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a class="page-scroll" href="#page-top"></a>
                    </li>
                    <li>
                        <a href="/account/card" class="navbar-brand page-scroll">Карты</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Платежи и переводы<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/payments/last">Последние платежи</a></li>
                            <li><a href="/payments/favorite">Избранные платежи</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="/payments/betweenCards">Перевод с карты на карту</a></li>
                            <li><a href="/payments/toSomeoneElse">Перевод пользователю Банкинга</a></li>
                            <li><a href="/payments/internet">Оплата интернета</a></li>
                            <li><a href="/payments/mts">МТС</a></li>
                            <li><a href="/payments/velcom">Velcom</a></li>

                        </ul>
                    </li>
                    <li>
                        <a href="/exchange" class="navbar-brand page-scroll">Курсы валют</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Мой аккаунт <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/user/profile">Профиль</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="/logout">Выйти</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>