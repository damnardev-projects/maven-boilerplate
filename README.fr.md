# Maven Boilerplate

[![en](https://img.shields.io/badge/lang-en-blue.svg)](README.md)
[![fr](https://img.shields.io/badge/lang-fr-blue.svg)](README.fr.md)

## Introduction

Ce projet Maven est un modèle prêt à l’emploi pour développer des applications Java. Il vous permet de créer facilement des projets avec une architecture multi-module. Vous y trouverez tous les outils nécessaires pour gérer vos dépendances avec Maven, tester votre code avec JUnit, mesurer la couverture de code avec JaCoCo et analyser la qualité avec SonarQube. Une application console de démonstration est également incluse pour vous aider à démarrer.

## Fonctionnalités

- **Java 21** : Utilise la dernière version LTS de Java avec toutes ses fonctionnalités modernes
- **Multi module** : Architecture modulaire permettant d'organiser le code en plusieurs projets interconnectés
- **Tests unitaires** : Framework de tests complet avec JUnit Jupiter et AssertJ pour des assertions expressives
- **Couverture de code** : Mesure automatique de la couverture avec JaCoCo et génération de rapports détaillés
- **Sonar** : Intégration SonarQube pour l'analyse continue de la qualité du code

## Versions Principales

- **Java** : 21
- **Maven** : 3
- **JUnit Jupiter** : 6

## Structure du Projet

```text
.
├── LICENSE
├── maven-cli/                 # Application console de démonstration
│   ├── pom.xml
│   └── src/
├── maven-common/              # Code partagé et utilitaires communs
│   ├── pom.xml
│   └── src/
├── maven-dependencies/        # Définition centralisée des versions de dépendances
│   └── pom.xml
├── maven-flatten-parent/      # Configuration parent pour l'aplatissement des POM
│   └── pom.xml
├── maven-parent/              # Configuration parent commune à tous les modules
│   └── pom.xml
├── maven-tests/               # Tests d'intégration et rapports de couverture globaux
│   └── pom.xml
├── pom.xml                    # POM principal du projet multi-module
└── README.fr.md               # Documentation du projet
```

## Prérequis

Avant d'utiliser ce boilerplate Maven, assurez-vous d'avoir les outils suivants installés :

- **Java** : JDK 21 ou version supérieure
- **Maven** : Version 3.6 ou supérieure pour la gestion des dépendances
- **Git** : Pour le contrôle de version

## Utilisation

### Installation

1. Clonez ce dépôt sur votre machine locale :
   ```bash
   git clone <repository-url>
   ```

2. Naviguez vers le répertoire du projet :
   ```bash
   cd maven-boilerplate
   ```

3. Installez les dépendances :
   ```bash
   mvn clean install
   ```

### Exécution du Projet

Utilisez les commandes Maven suivantes pour gérer votre projet Maven :

| Commande                                          | Description                                                           |
|---------------------------------------------------|-----------------------------------------------------------------------|
| `mvn clean`                                       | Nettoie les fichiers de build générés                                |  
| `mvn compile`                                     | Compile tous les modules Maven                                       |
| `mvn test`                                        | Exécute tous les tests avec JUnit Jupiter                            |
| `mvn exec:java -pl maven-cli`                     | Démarre l'application console Java                                   |
| `mvn jacoco:report`                               | Génère les rapports de couverture de code                            |
| `mvn verify`                                      | Génère le rapport JaCoCo agrégé dans maven-tests                     |
| `mvn sonar:sonar`                                 | Exécute l'analyse SonarQube (nécessite une configuration)            |
| `mvn versions:display-dependency-updates`         | Affiche les mises à jour disponibles pour les dépendances du projet  |
