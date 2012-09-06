'use strict';

/* Controllers */
function SpeakerCtrl($scope) {
	$scope.$on('speaker.create', function() {
		$scope.$broadcast('speaker.create');
	});
}
SpeakerCtrl.$inject = ['$scope'];

function ListSpeakerCtrl($scope, $http) {
	$http.get('speakers')
	.success(function(speakers) {
		$scope.speakers = speakers;
	});
	$scope.$on('speaker.create', function() {
		$http.get('speakers')
		.success(function(speakers) {
			$scope.speakers = speakers;
		});
	});
}
ListSpeakerCtrl.$inject = ['$scope', '$http'];

function CreateSpeakerCtrl($scope, $http) {
	$scope.createSpeaker = function() {
		$http.put('speaker', {
			'name': $scope.speakerName
		})
		.success(function(speaker) {
			$scope.$emit('speaker.create');
		});
	};
}
CreateSpeakerCtrl.$inject = ['$scope', '$http'];