# Imersão Java ୧

૪ Repository with projects made during a week of Java Immersion by Alura.

## Timeline ୧
ෆ Lesson 1 - Consuming a movie API with Java ෆ
<br>
ෆ Lesson 2 - Generating stickers for WhatsApp ෆ
<br>
ෆ Lesson 3 - Connecting the ends, refactoring and object orientation ෆ
<br>
ෆ Lesson 4 - Creating our own API with Spring ෆ
<br>
ෆ Lesson 5 - Publishing our API to the Cloud ෆ
<br>



### Class 1 -> imdb-api ୧

૪ In this class, the public API of the IMDB site was used with the endpoint `top250movies`. 
<br>
૪ With the package `java.net.http` were realized:
<br>
૪ 1. The API connection.
<br>
૪ 2. Data request with a specific class made available in class.
<br>
૪ 3. Screen printing of the following sfilmes data: title, image, score.
<br>
૪ 4. With the challenge proposed by the mentors, the score was refactored in order to have a better layout with colors and emojis.
<br>

#### Image of the result of project 1 ୧
![toreadme](https://user-images.githubusercontent.com/92932195/228085619-d1e59871-1349-43f6-b8e0-420cadc4e451.png)


### Class 2 -> Sticker Generator for WhatsApp ୧

૪ On the second day, the images available in the request data (JSON) were used to create stickers. With the help of the java.awt, java.io and java.ImageIO packages, it was possible to edit images and insert texts.
<br>
૪ In this program, we will use the movie note as the basis for the phrase that will be generated with your sticker.
<br>
૪ 1. If the film has a score of 8 or higher, it will be printed with the phrase: "BRABO D+!".
<br>
૪ 2. If the film has a score lower than 8 and higher than 4, the film will be printed with the phrase: "TEM MELHORES...".
<br>
૪ 3. If the film has a score lower than 4 , the film will be printed with the phrase: "NÃO VALE A PENA".
<br>

#### Image of the result of project 2 ୧
![teste1](https://user-images.githubusercontent.com/92932195/228356943-2634b062-991c-44ed-97ff-100ee7dd0736.png)

<br>

<img src="https://user-images.githubusercontent.com/92932195/228357045-b7207eff-9f78-4711-9923-503f21d57757.png" width="300" height="350"/>
<img src="https://user-images.githubusercontent.com/92932195/228357094-6bf8ba82-a65e-40fe-ace1-766703fb175e.png" width="300" height="350"/>