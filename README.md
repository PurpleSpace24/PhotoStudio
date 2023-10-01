# RealEstateAgency
RealEstateAgency
---BG---
Във фотостудио (PhotoStudio) се правят и печатат на хартия снимки (Picture). Снимките имат 
уникален идентификационен номер (id), размер, дата на създаване, име на собственик и тип на 
поръчката (EXPESS, FAST, STANDARD). Естествената наредба на снимките е по id.

1. В клас фотостудио да се реализира възможност за запазване на колекция с
направените снимки. В колекцията не се допускат повторения на снимките. Реализирайте 
методи за:
- Добавяне на снимка в колекцията.
- Показване на снимките, подредени по датата на създаване и след това по името на собственика.
- Показване на снимките, които са с размер по-голям от 2MB
- Показване на снимката, която е с най-голямото id.
- Връщане на колекцията от снимки, които са с тип на поръчката EXPRESS

2. В клас фотостудио трябва да се пази информация за отпечатването на снимките на хартия. За тази цел трябва да се направи колекция, в която снимките да се отпечатват по
следния начин: първо STANDARD, след това FAST и накрая EXPRESS. Да се реализира метод за показване реда, по който се отпечатват снимките в колекцията.

3. В клас фотостудио трябва да се пази колекция от архивирани снимки. Тази колекция трябва да показва всяка от снимките на коя дата е архивирана. Да се реализират методи за:
- Добавяне на снимка и дата на архивиране в колекцията.
- Показване на архивираните снимки, подредени по името на собственика.
- Показване на архивираните снимки, с име на собственик, което съдържа низа „Ivan“ и датата им на архивиране

---EN---
In a photo studio (PhotoStudio) pictures are taken and printed on paper (Picture). 
Photos have a unique identification number (id), size, creation date, owner name and order type (EXPESS, FAST, STANDARD). 
The natural order of the photos is by id.

1. In the photo studio class, it should be possible to save a collection of the photos taken. Duplicate photos are not allowed in the collection. Implement methods to:
- Add a photo to the collection.
- Display photos sorted by creation date and then owner name.
- Display photos that are larger than 2MB in size
- Display the photo that has the highest id.
- Return the collection of photos that are of the order type EXPRESS

2. In the photo studio class, information about printing the photos on paper should be kept.
For this purpose, a collection should be made in which the photos are printed in the following way: first STANDARD, then FAST and finally EXPRESS.
Implement a method to display the order in which the photos in the collection are printed.

3. A collection of archived photos should be kept in the photo studio class. This collection should show each of the photos on which date it was archived. To implement methods for:
- Add photo and archive date to collection.
- Display archived photos sorted by owner name.
- Display the archived photos, with an owner name that contains the string "Ivan" and the date they were archived
