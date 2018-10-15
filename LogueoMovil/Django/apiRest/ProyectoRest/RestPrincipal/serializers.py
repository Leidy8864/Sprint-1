from rest_framework import serializers

from Principal.models import Estudiante

class EstudianteSerializer(serializers.ModelSerializer):
	class Meta:
		model= Estudiante
		fields= ('id_est', 'nombre_est', 'correo_est', 'password_est')