var app = angular.module("Calculator", []).controller("CalculatorController",
    function CalculatorController($scope, $http) {

        $scope.firstdisplayValue = 0;
        $scope.operation = null;
        $scope.result = null;
        $scope.memory = null;
        

        $scope.saveInMemory = function() {
            if ($scope.memory == null) {
                $scope.memory = $scope.firstdisplayValue;
            }
        };

        $scope.onClickClear = function() {
            $scope.firstdisplayValue = 0;
            $scope.memory = null;
            $scope.result = null;
            $scope.operation = null;
        };

        $scope.onClickSum = function() {
            $scope.saveInMemory();
            $scope.operation = "+";
            $scope.firstdisplayValue = 0;
        };

        $scope.onClickSubtract = function(){
            $scope.saveInMemory();
            $scope.operation = "-";
            $scope.firstdisplayValue = 0;

        };
        $scope.onClickMultiply = function() {
            $scope.saveInMemory();
            $scope.operation = "*";
            $scope.firstdisplayValue = 0;
        };

        $scope.onClickDivide = function() {
            $scope.saveInMemory();
            $scope.operation = "/";
            $scope.firstdisplayValue = 0;
        };

        $scope.onClickSqrt = function() {
            callServer("SQRT");
        };
        $scope.onClickAbs = function() {
            callServer("ABS");
        };
        $scope.onClickTan = function() {
            callServer("TAN");
        };
        $scope.onClickSin = function() {
            callServer("SIN");
        };
        $scope.onClickCos = function() {
            callServer("COS");
        };
        $scope.onClickPow= function() {
            callServer("POW");
        };
        $scope.onClickProc= function() {
            callServer("PROC");
        };
        $scope.onClickDivideONE= function() {
            callServer("DIVIDEONE");
        };

        $scope.onClickCalculate = function() {
            if ($scope.operation == "-"){
                callServer("MINUS");
                reset();
            }
            else if ($scope.operation == "+"){
                callServer("PLUS");
                reset();
            }
            else if ($scope.operation == "*"){
                callServer("MULTIPLY");
                reset();
            }
            else if ($scope.operation == "/"){
                callServer("DIVIDE");
                reset();
            }
        };

        function reset() {
            $scope.firstdisplayValue = 0;
            $scope.memory = null;
            $scope.result = null;
            $scope.operation = null;
    }

        function callServer(operation) {
            var data = {
                numberOne: $scope.firstdisplayValue,
                numberTwo: $scope.memory,
                operationType: operation
            };
            $http.post("http://localhost:8080/welcome/calculator/method", data)
                .then(function(response) {
                    console.log(JSON.stringify(response));
                    $scope.result = response.data.result;
                });
        }
    });

