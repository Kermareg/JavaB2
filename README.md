# Java Bloc 2
Correction des exercices de java réalisés dans le cadre des cours d'initiation à la programmation objet et programmation objet 2.

## Initiation
Les exercices corrigés disponibles sont les suivants : 
* Hello
* Hello + prénom

Les différents exercices sont disposés dans des packages différents afin de tout conserver dans un seul projet java. Cela permet de vous faciliter la récupération automatique des exercices grâce à la commande ```git pull``` dans la racine de ce dossier.
Afin de ne pas avoir de conflits, il est conseillé de dédier un projet java uniquement aux correction. Evitez de modifier ces fichiers. N'étant pas pas habitués à GIT, se sera plus simple ainsi :-).

## Programmation orientée objet 2

# Import du projet : 

Dans le dossier du workspace : ```git clone https://github.com/Kermareg/JavaB2.git```

Un ls/dir montrera qu'il y a un second répertoire (JavaB2) présent.

## Import dans Eclipse
### Mode barbare
* Clic droit dans l'arborescence de projet : "Import"
* Sous l'onglet Général : Existing Project into Workspace > NEXT
  * Sélection de la root directory : JavaB2
  * Le projet est normalement visible sous le navigateur de projet. 
  * Finish, le projet est importé.
  
### Mode  GIT
Avec les nouvelles versions d'eclipse, il est possible d'importer directement le dépot dans votre workspace.
* Clic droit sur l'arborescence des projets
  * Import
  * GIT
  * Clone URi
Rentrer dans la barre d'adresse l'adresse du dépôt git à cloner. Les autres champs se complètent automatiquement. Il ne faut rien modifier d'autre. L'importation devrait se faire sans problèmes.
 

## Mise à jour du JRE *si nécessaire*

Dans certains cas un petit attention est affiché à l'entête du projet. Cela est dû au fait 
qu'on n'a pas la même version de JRE entre celui du professeur et celui installé sur la machine cible.
Pour corriger ce problème : 
* Clic droit sur le projet
  * Build Path
  * Configure Build Path
* Aller dans l'onglet ```libraries``` et supprimer Java 1.8
* Add Library
  * Sélectionner ```JRE System Library```
  * Sélectionner Execution Library et sélectionner la plus haute version de votre ordinateur. Dans mon cas : ```JavaSE-1.7```
* FINISH

# Installation de GIT
## Client GIT
* Aller sur le site de [GIT-SCM](https://git-scm.com/downloads) et télécharger le client propre à votre achitecture
* Installer le client avec les options par défaut

Deux options s e sont ajoutées au menu contextuel : 
* `git bash`
* `git gui`
git bash permet d’ouvrir la console GIT où des commande à la bash sont utilisées. 


