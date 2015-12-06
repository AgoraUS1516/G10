var agoraUSApp = angular.module('AgoraUS', [ 'ngRoute', 'AgoraUSControllers' ]);

agoraUSApp.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$routeProvider.
			when('/',{
				templateUrl:'views/main/main.html',
				controller:'MainViewController'
			}).
			when('/resultados/encuestas', {
				templateUrl : 'views/visualizacion/encuesta.html',
				controller : 'VisualizacionRestController'
			})./* Aqui van mas configuraciones de ruta */
			otherwise({
				redirectTo : '/error.html'
			});

			// configure html5 to get links working on jsfiddle
			$locationProvider.html5Mode(true);
		} ]);