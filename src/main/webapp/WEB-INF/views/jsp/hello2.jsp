<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        
       <spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss" />
		<spring:url value="/resources/core/css/bootstrap-responsive.css" var="responsiveCss" />
		
		 
		<spring:url value="/resources/core/css/custom-styles.css" var="customstylecss" />
		
		<spring:url value="/resources/core/css/font-awesome.css" var="font1css" />
		<spring:url value="/resources/core/css/font-awesome-ie7.css" var="font2css" />
			
		<link href="${bootstrapCss}" rel="stylesheet" />
		<link href="${responsiveCss}" rel="stylesheet" />
		
        <link rel="stylesheet" href="${customstylecss}">
        <link rel="stylesheet" href="${font1css}">
        
        <link rel="stylesheet" href="${font2css}">
        
        <spring:url value="/connexion" var="connexion" />
        <spring:url value="/inscription" var="inscription" />
        <spring:url value="/" var="index" />

       
       <spring:url value="/resources/core/js/modernizr-2.6.2-respond-1.1.0.min.js" var="modernjs" />
 
		<script src="${modernjs}"></script>
		
	
    </head>
    <body>
	   
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
         <spring:url value="/resources/core/picture/gudetama.png" var="gudetamapng" />
				<center><img  src="${gudetamapng}" alt="gudetama" align="middle" style="width:482px;height:169px;"></center>
            <div class="container">

                <div class="row-fluid">
                
                    <div class="span8 offset2">
                        <div class="site-header">
                            <div class="logo">
                                <h1>GUDETAMA FRANCE</h1>
                            </div>
                            <div class="menu">
                                <div class="navbar">
                                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                                        <i class="fw-icon-th-list"></i>
                                    </a>
                                    <div class="nav-collapse collapse">
                                        <ul class="nav">
                                            <li class="active"><a href="${index}">ACCUEIL</a></li>
                                        </ul>
                                    </div><!--/.nav-collapse -->
                                </div>
                                <div class="mini-menu">
            <label>
          <select class="selectnav">
            <option value="#" selected="">Home</option>
            <option value="#">About</option>
            <option value="#">→ Another action</option>
            <option value="#">→ Something else here</option>
            <option value="#">→ Another action</option>
            <option value="#">→ Something else here</option>
            <option value="#">Services</option>
            <option value="#">Work</option>
            <option value="#">Contact</option>
          </select>
          </label>
          </div>

                            </div>
                        </div>
						  <div class="featured-heading">
                            <div class="row-fluid">
                                <div class="span10 offset1">
                                    <h1>CHERCHER UN épisode</h1>
                                    <section class="webdesigntuts-workshop">
	<form action="" method="">		    
		<input type="search" placeholder="épisode..">		    	
	</form>
</section>
                                    <a href="#" class="btn">RECHERCHER</a>
                                </div>
                            </div>
                        </div>
                        <div class="banner-shadow">
                        <div class="banner">
                            <div class="carousel slide" id="myCarousel">
                                        <!-- Carousel items -->
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <iframe width="770" height="482" src="https://www.youtube.com/embed/uvcKW8El8MU" frameborder="0" allowfullscreen></iframe>
                                        <div class="carousel-caption">
                                       
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                      
                        <div class="contact-info">
                        
                           
                                
                                    <div class="block">
									
                                        <h1 align=center" color="red" >UPLOADER UN SOUS TITRE POUR CET éPISODE</h1>
                                        
                                        <spring:url value="/resources/core/picture/upload.png" var="uploadpng" />
                                        
                                      <img src="${uploadpng}" alt="uploader" style="width:150px;height:110px;">
                                    
                                </div>
                            </div>
                       
                        
                        <div class="contact-info">
                            <h1>Nous Contacter</h1>

                           
                              <form>
                                  <div class="controls">
                                      <input id="name" name="name" type="text" class="span5" placeholder="Votre nom.."> 
                                      <input id="email" name="email" type="email" class="span5" placeholder="Votre Adresse Mail..">
                                  </div>
                                  <div class="controls">
                                      <textarea id="message" name="message" class="span10" placeholder="Votre message.." rows="5"></textarea>
                                  </div>
                                  
                                  <div class="controls">
                                      <button id="contact-submit" type="submit" class="btn">Envoyer</button>
                                  </div>
                              </form>
                            
                        </div>
                        <
                    </div>
                </div>
            </div>

<spring:url value="/resources/core/js/jquery-1.9.1.js" var="jqueryjs" />
 
<script src="${jqueryjs}"></script>

<spring:url value="/resources/core/js/bootstrap.js" var="bootstrapjs" />
 
<script src="${bootstrapjs}"></script>


<script>
$('#myCarousel').carousel({
    interval: 1800
});
</script>

    </body>
</html>
