
function viewform(val){
	if(val=='dong'){
		var form = document.getElementById('dong_form');
		form.style.visibility="visible";
		var form2 = document.getElementById('apart_form');
		form2.style.visibility="hidden";
	}else if(val=='apart'){
		var form = document.getElementById('apart_form');
		form.style.visibility="visible";
		var form2 = document.getElementById('dong_form');
		form2.style.visibility="hidden";
	}
}

var multi = {
				lat : 37.5012743,
				lng : 127.039585
			};
			var map;
			var markers = [];
			var infoWindow;

			function initMap() {
				map = new google.maps.Map(document.getElementById('map'), {
					center : multi,
					zoom : 15
				});

				infoWindow = new google.maps.InfoWindow;

				const myposition = "img/my_position.png";

				//멀티캠퍼스
				//const multimarker = new google.maps.Marker({coords: multi, content: '멀티캠퍼스', iconImage: myposition});
				var multimarker = {
					coords : multi,
					iconImage : myposition,
					content : '멀티캠퍼스(역삼)'
				};
				addMarker(multimarker);
				infoWindow.setPosition(multi);
				infoWindow.setContent('강변 금호타운');
				infoWindow.open(map);
			}

			/*
			// Geolocation
			infoWindow = new google.maps.InfoWindow;
			if (navigator.geolocation) {
				navigator.geolocation.getCurrentPosition(function(position) {
					var pos = {
						lat: position.coords.latitude,
						lng: position.coords.longitude
					};
					
					var mymarker = {
							coords: pos,
							iconImage: myposition,
							content: '현재위치'
					};
					addMarker(mymarker);
					
					infoWindow.setPosition(pos);
					infoWindow.setContent('현재 나의 위치.');
					infoWindow.open(map);
					map.setCenter(pos);
				}, function() {
					handleLocationError(true, infoWindow, map.getCenter());
				});
			} else {
				handleLocationError(false, infoWindow, map.getCenter());
			}
			}
			
			function handleLocationError(browserHasGeolocation, infoWindow, pos) {
			infoWindow.setPosition(pos);
			infoWindow.setContent(browserHasGeolocation ?
				'Error: Geolocation 서비스 실패.' :
				'Error: Geolocation을 지원하지 않는 브라우저.');
			infoWindow.open(map);
			}
			 */
			function addMarker(props) {
				const marker = new google.maps.Marker({
					position : new google.maps.LatLng(
							parseFloat(props.coords.lat),
							parseFloat(props.coords.lng)),
					map : map
				});
				map.setCenter(marker.getPosition());
				map.setZoom(15);

				if (props.iconImage) {
					marker.setIcon(props.iconImage);
				}

				if (props.content) {
					infoWindow = new google.maps.InfoWindow({
						content : props.content
					});

				}

				marker.addListener('click', function() {
					map.setZoom(17);
					map.setCenter(marker.getPosition());
					bounceMarker(marker);
				});
				markers.push(marker);
				setMapOnAll(map);
			}

			function bounceMarker(marker) {
				if (marker.getAnimation() !== null) {
					marker.setAnimation(null);
				} else {
					marker.setAnimation(google.maps.Animation.BOUNCE);
				}
			}

			function deleteMarkers() {
				clearMarkers();
				markers = [];
			}

			function clearMarkers() {
				setMapOnAll(null);
			}

			function setMapOnAll(map) {
				for (let i = 0; i < markers.length; i++) {
					markers[i].setMap(map);
				}
			}