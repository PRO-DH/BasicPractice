from django.shortcuts import render

# Create your views here.

from django.http import HttpResponse

def seoul(request):
     return HttpResponse("hi seoul")


def busan(request):
    return HttpResponse("hi busan")
