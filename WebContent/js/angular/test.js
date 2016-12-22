/**
 * Angular学习
 */


var app = angular.module('myApp', []);
app.run(function($rootScope) {
    $rootScope.rootname = "Duningkai";

});

app.controller('FilterController', ['$scope', '$filter', function($scope, $filter) {
    $scope.today = new Date();
    $scope.str = "Hello Angular";
    $scope.number = 120.45687899;
    $scope.names = ["小黄", "小茗", "小花"];
    $scope.objects = {
        id: 1,
        name: "ningkai",
        age: 22,
        school: "HUST,ZJU"
    }




}]);

app.directive('hospitalDirective', function() {
    // Runs during compile
    return {
        // name: '',
        // priority: 1,
        // terminal: true,
        scope: {
            myUrl: '@',
            myLinkText: '@'
        }, // {} = isolate, true = child, false/undefined = no change
        // controller: function($scope, $element, $attrs, $transclude) {},
        // require: 'ngModel', // Array = multiple requires, ? = optional, ^ = check parent elements
        restrict: 'A', // E = Element, A = Attribute, C = Class, M = Comment
        //template: '<img src="../images/hospital.jpg">',
        template: '<a href="{{myUrl}}">{{myLinkText}}</a>',
        // templateUrl: '',
        replace: true,
        // transclude: true,
        // compile: function(tElement, tAttrs, function transclude(function(scope, cloneLinkingFn){ return function linking(scope, elm, attrs){}})),

    };
});

app.controller('LotteryController', function($scope) {
    $scope.generateNumber = function() {
        return Math.floor((Math.random() * 10) + 1);
    }
});

app.controller('repeatController', function($scope) {
    $scope.names = ["小黄", "小茗", "小花"];
});

app.controller('locationController',function($scope, $location){
	//返回当前页面的URL
	$scope.currentUrl=$location.absUrl();
});


//$timeout
app.controller('timeoutController', function($scope, $timeout) {
    $scope.myHeader = "Hello World!";
    $timeout(function () {
        $scope.myHeader = "How are you today?";
    }, 2000);
});

//$interval
app.controller('intervalController', function($scope, $interval) {
    $scope.theTime = new Date().toLocaleTimeString();
    $interval(function () {
        $scope.theTime = new Date().toLocaleTimeString();
    }, 1000);
});

//创建自定义服务
app.service('hexafy', function(){
	this.hex=function(x){
		return x.toString(16);
	}
});

app.controller('selfController',  function($scope,hexafy){
	$scope.hexValue=hexafy.hex(3156);
});

//自定义过滤器，使用自定义服务
app.filter('toHex',['hexafy',function(hexafy){
	return function(x){
		return hexafy.hex(x);
	}

}])

//Http
app.controller('httpController',function($scope,$http){
	$http.get("../json/sites.php").then(function(response){
		$scope.nameList=response.data.sites;
		debugger;
	})
});
