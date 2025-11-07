# A Game to be Improved
**[ES] - English below**

Este repositorio es un proyecto de JavaFX para practicar la creación y modificación de un repositorio propio a partir de una base.

## Objetivos

El objetivo principal es hacer un _fork_ (bifuración) del proyecto, para mejorar la lógica del juego o añadir funcionalidades y crear un repositorio donde se vea esto.
Además, deberás hacerlo en una nueva **rama (branch)** de desarrollo y después fusionar los cambios con la principal. También deberás crear un archivo README.md donde expliques tus mejoras.

Como novedad, vamos a usar el cliente Git [GitKraken](https://www.gitkraken.com/). Un cliente Git es un software que nos proporciona una interfaz para gestionar y visualizar todos los cambios de un repositorio. En principio, no necesitaremos usar comandos y todo será -en principio- más intuitivo. Aun así, seguramente tengas que buscar algo de información para algún paso.

He elegido GitKraken por estar disponible en Windows, Linux y MacOS. Ignorad sus propuestas de plan de pago. Es posible que os llegue algún correo comercial, ¡mil disculpas! Desuscribiros de sus _newsletter_.

Los pasos se resumen en los siguientes. ¡No te olvides de sacar capturas!

1. Crea un repositorio vacío en tu cuenta con la interfaz web de GitHub.
2. Clona este repositorio en tu PC. Modifica el origen remoto para añadir tu nuevo repositorio.
3. **Crea una nueva rama (branch)** con la ayuda de la UI de GitKraken.
4. Modifica el proyecto para añadir funcionalidades. Puede servir cualquier aspecto de la jugabilidad (sistema de puntuación, calibración de la velocidad, ajustes de la interfaz, incorporación de imágenes o música).
5. Realiza al menos un commit y un push a esta branch.
6. Fusiona los cambios en tu rama secundaria con tu rama principal.
7. Borra este archivo `README.md` y crea uno nuevo desde cero en el que expliques qué funcionalidades has añadido. Además, deberás explicar en este archivo cómo ha sido el proceso creando tu _fork_ del proyecto, adjuntando las capturas correspondientes. ¡Se valorará el formato correcto de este archivo!
8. En el aules solamente dejarás el link (en texto plano) a tu repositorio. Márcalo como entregado una vez hayas acabado. Se valorará el último commit antes de la fecha de entrega.

[Aquí](https://github.com/alvaro-ruizg/LearnGit/blob/main/MarkDownFormatExample.md) tienes algo de ayuda para crear tu archivo `README.md`. Deja tus imágenes en un directorio llamado img y muestralas con:
```![Alt Text](./img/demoimage.png)```

Para ver correctamente el contenido de un archivo `.md` antes de subirlo puedes usar el propio editor de IntelliJ, extensiones de VSCode o extensiones del navegador como [Markdown Reader](https://chromewebstore.google.com/detail/markdown-reader/medapdbncneneejhbgcjceippjlfkmkg?pli=1).

## Cómo ejecutar el proyecto

Este proyecto está configurado con **Maven**. Usa JavaFX para la interfaz de usuario. Se recomienda el IDE IntelliJ para ejecutarlo correctamente.

Te recomiendo ver (y respetar) la estructura de directorios. Este proyecto sigue la arquitectura Model-Controller-View (MCV). Esto quiere decir que las clases se dividen en:
- Model: Clases como GameModel, que se encargan de la lógica interna del programa.
- Controller: Clases como GameOverController, se encargan de conectar la interfaz gráfica con la lógica interna del juego.
- View: Archivos como `game-view.fxml`, que muestran el contenido de la interfaz.

## Uso de la IA generativa

Si haces uso de IA para el proceso de mejora de algun aspecto de la lógica del juego, **cítala correctamente**. [Cómo citar a la IA - UOC](https://openaccess.uoc.edu/server/api/core/bitstreams/2ef41918-449d-4033-a6c7-1f04dad489dd/content)

En mi caso, sería algo como:

- Juego generado con Google Gemini, modelo de lenguaje grande (2025). Prompt usado:

```
Creame un juego en JavaFX. No necesito ninguna funcionalidad de base de datos.

Simplemente habrá circulos de tamaño alteatorio (entre un min y un max) cayendo desde arriba abajo de la pantalla.

Hacer click en los circulos da puntos, si rebasan una linea (situada en el pie de la pantalla), perderan una vida. Al perder 3 vidas se acaba el juego.

Hazme también en fxml:

- Una pantalla de juego.
- Una pantalla de inicio
- Una pantalla de game over.


Créame tambien las clases necesarias para la logica del juego, de acuerdo a la arquitectura Controlador-Modelo-Vista
```

-----

# A Game to be Improved
**[EN] - Spanish above**

This repository is a JavaFX project intended for practicing the creation and modification of your own repository based on a starter project.



## Objectives

The main objective is to **fork** the project to improve the game's logic or add new features, creating a repository where these changes are visible.

Additionally, you must perform this work in a new development **branch** and subsequently **merge** the changes with the main branch. You must also create a `README.md` file explaining your improvements.

As a novelty, we will be using the Git client **[GitKraken](https://www.gitkraken.com/)**. A Git client is software that provides an interface to manage and visualize all changes within a repository. In theory, we won't need to use commands, and everything will be — in principle — more intuitive. Even so, you will likely need to search for information for some steps.

I have chosen GitKraken because it is available on Windows, Linux, and macOS. Please ignore their paid plan proposals. You might receive some promotional emails; my apologies\! Unsubscribe from their newsletters.

The steps are summarized below. **Don't forget to take screenshots\!**

1.  Create an empty repository on your account using the GitHub web interface.
2.  Clone this repository to your PC. Modify the remote origin to point to your new repository.
3.  **Create a new branch** using the GitKraken UI.
4.  Modify the project to add new functionalities. This can be any aspect of the gameplay (scoring system, speed calibration, interface adjustments, incorporating images or music).
5.  Perform at least one **commit** and one **push** to this branch.
6.  **Merge** the changes from your secondary branch into your main branch.
7.  Delete this `README.md` file and create a new one from scratch in which you explain what functionalities you have added. Furthermore, you must explain in this file how the process of creating your **fork** of the project was, attaching the corresponding screenshots. **Proper formatting of this file will be assessed\!**
8.  In the Aules platform, you will only submit the link (in plain text) to your repository. Mark it as delivered once you have finished. The last commit before the submission deadline will be evaluated.

You can find some help for creating your `README.md` file [here](https://github.com/alvaro-ruizg/LearnGit/blob/main/MarkDownFormatExample.md). Place your images in a directory named `img` and display them using:
`![Alt Text](./img/demoimage.png)`

To properly view the content of a `.md` file before uploading, you can use the built-in IntelliJ editor, VSCode extensions, or browser extensions like [Markdown Reader](https://chromewebstore.google.com/detail/markdown-reader/medapdbncneneejhbgcjceippjlfkmkg?pli=1).

-----

## How to Run the Project

This project is configured with **Maven**. It uses JavaFX for the user interface. The IntelliJ IDE is recommended for correct execution.

I recommend reviewing (and respecting) the directory structure. This project follows the **Model-Controller-View (MCV)** architecture. This means the classes are divided into:

  * **Model:** Classes, like `GameModel`, that handle the internal logic of the program.
  * **Controller:** Classes, like `GameOverController`, that connect the graphical interface with the internal game logic.
  * **View:** Files, like `game-view.fxml`, that display the interface content.

-----

## Use of Generative AI

If you use AI for the process of improving any aspect of the game's logic, **cite it correctly**. [How to cite AI - UOC](https://openaccess.uoc.edu/server/api/core/bitstreams/2ef41918-449d-4033-a6c7-1f04dad489dd/content)

In my case, the citation would be something like:

  * Game generated with Google Gemini, large language model (2025). Prompt used:

    ```
    Creame un juego en JavaFX. No necesito ninguna funcionalidad de base de datos.

    Simplemente habrá circulos de tamaño alteatorio (entre un min y un max) cayendo desde arriba abajo de la pantalla.

    Hacer click en los circulos da puntos, si rebasan una linea (situada en el pie de la pantalla), perderan una vida. Al perder 3 vidas se acaba el juego.

    Hazme también en fxml:

    - Una pantalla de juego.
    - Una pantalla de inicio
    - Una pantalla de game over.


    Créame tambien las clases necesarias para la logica del juego, de acuerdo a la arquitectura Controlador-Modelo-Vista
    ```