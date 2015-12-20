var agoraUSApp = angular.module('AgoraUS', [ 'ngRoute', 'AgoraUSControllers' ]);

agoraUSApp.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$routeProvider.
			when('/',{
				templateUrl:'views/main/main.html',
				controller:'MainViewController'
			}).
			when('/resultados/encuestas.do', {
				templateUrl : 'views/visualizacion/encuesta.html',
				controller : 'VisualizacionRestController'
			}).//Errores
			when('/error.do',{
				templateUrl: 'views/main/error.html',
				controller: 'ErrorController'
			})./* Aqui van mas configuraciones de ruta */
			otherwise({
				redirectTo : '/error.html'
			});

			// configure html5 to get links working on jsfiddle
			$locationProvider.html5Mode(true);
		} ]);