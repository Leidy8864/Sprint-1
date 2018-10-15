from rest_framework import generics
from rest_framework import viewsets

from .serializers import EstudianteSerializer
from Principal.models import Estudiante

class EstudianteViewSet(viewsets.ModelViewSet):
	queryset = Estudiante.objects.all()
	serializer_class = EstudianteSerializer