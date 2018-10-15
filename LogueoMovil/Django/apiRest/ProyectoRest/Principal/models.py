from django.db import models


class Estudiante(models.Model):
    id_est = models.CharField(primary_key=True, max_length=15)
    nombre_est = models.CharField(max_length=50)
    correo_est = models.CharField(max_length=50)
    password_est = models.CharField(max_length=50)

    def __unicode__(self):
    	return self.id_est