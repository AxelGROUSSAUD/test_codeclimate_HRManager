#!/bin/bash

#Boucle qui va démarrer chaque container fourni en paramètre
for i in "$@"
do

  #Affiche le paramètre renseigner (Debug)
  echo $i

  #Declare une variable qui récupère l'id du container
  id_container=$(podman ps -a -q --filter "name=$i" | head -n 1)

  #Affiche l'id du container (Debug)
  echo "$id_container"
  
  #Si on trouve un id d'un container
  if [ ${#id_container} -ne 0 ]; then
  
    #Récupère le status du container en fonction de son id
    status_container=$(podman inspect "$id_container" --format '{{.State.Status}}')

    #Affiche le status du container (Debug)
    echo "$status_container"

    # si le container n'est pas lancé alors on le démarre
    if [ $status_container != "running" ]; then
      podman start $id_container
    fi
  
  else
    echo "Il n'existe pas de container à ce nom : '$i' !"
  fi

done

#Permet de garder la fenêtre shell ouverte après l'exécution du script
read