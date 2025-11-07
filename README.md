# Proyecto: Mejora del juego "A Game to be Improved"

## Proceso paso a paso

### Paso 1: Creación del repositorio
Entré en GitHub y creé un repositorio vacío en mi cuenta.  
Luego copié la URL del repositorio original del proyecto “A Game to be Improved” y lo cloné en mi ordenador desde GitKraken.  

---

### Paso 2: Cambio del origen remoto
Después de clonar el proyecto original, cambié el origen remoto para enlazarlo con mi nuevo repositorio vacío, de forma que los cambios se subieran a mi propio repositorio.

---

### Paso 3: Crear una nueva rama de desarrollo
Desde GitKraken, creé una nueva rama llamada `dev`.  
Esto lo hice con clic derecho sobre la rama principal (`main`) → Create branch → escribí `dev`.

---

### Paso 4: Realizar mejoras en el proyecto
Aquí empecé con las modificaciones en el código Java.

#### En `GameModel.java`
- Añadí una nueva propiedad llamada `bonus` para llevar el conteo de recompensas.  
- Modifiqué el método `addScore()` para que:
  - Cada 200 puntos se sume un bonus de +10 puntos.
  - Además, se otorgue una vida extra cuando se alcanza ese umbral.
- Añadí los siguientes métodos:

```java
public void addBonus(int points) {
    score.set(score.get() + points);
    bonus.set(bonus.get() + 1);
}

public void extraLife() {
    if (lives.get() < MAX_LIVES) {
        lives.set(lives.get() + 1);
    }
}
```

#### En `GameController.java`
- Cambié el evento de los círculos de `setOnMouseClicked` a `setOnMousePressed` para que se eliminen con un solo clic:
```java
circle.setOnMousePressed(event -> {
    model.addScore((int) circle.getUserData());
    gamePane.getChildren().remove(circle);
    event.consume();
});
```
- Añadí la comprobación del bonus y la vida extra cuando se llega a 200 puntos:
```java
if (model.getScore() % 200 == 0) {
    model.addBonus(10);
    model.extraLife();
}
```

Con estos cambios, el juego ahora:
- Es más fluido al jugar.
- Tiene una recompensa por progreso (bonus + vida).
- Responde con un solo clic en los círculos.

---

### Paso 5: Commit y Push
Hice un commit de los cambios en la rama `dev` y luego un push para subirlos al repositorio remoto.

---

### Paso 6: Fusión de ramas
Después, desde GitKraken:
1. Cambié a la rama `main` (clic derecho → Checkout main).  
2. Arrastré la rama `dev` sobre `main`.  
3. Seleccioné Merge dev into main.  
4. Comprobé que no hubiera conflictos.  
5. Hice Push para subir la versión final.

---

### Paso 7: Crear el README
Eliminé el README original y creé este nuevo documento explicando las mejoras y el proceso completo.  
Además, añadí las capturas de pantalla del proceso dentro de una carpeta llamada `img`.

CAPTURA DEL ARBOL DE GIT KRAKEN CON TODO REALIZADO
![Captura GitKraken](./img/vista-general)

CAPTURA DE LOS COMMITS EN GIT HUB
![Captura Git Hub](./img/commits)

CAPTURA DE LOS NUEVOS EXTRAS PARA EL JUEGO EN INTELLIJ IDEA
![Captura IntelliJ IDEA](./img/game-controller)

![Captura IntelliJ IDEA](./img/game-model1)

![Captura IntelliJ IDEA](./img/game-model2)



---

## Resultado final
El juego ahora tiene una jugabilidad más entretenida:
- Círculos que se destruyen con un solo clic.  
- Sistema de bonus cada 200 puntos (+10 puntos y +1 vida).  
- Código limpio y comentado.  

El proyecto fue gestionado y versionado completamente desde GitKraken e intelliji IDEA aprendiendo a trabajar con ramas, merges y repositorios remotos. Los cambios en el juego los he realizado con ayuda de chatgpt. 

