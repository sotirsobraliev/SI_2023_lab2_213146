# Втора лабораториска вежба по Софтверско инженерство

## Сотир Собралиев, бр. на индекс 213146

###  Control Flow Graph

Фотографија од control flow graph-ot 
![graph1.jpg](https://github.com/sotirsobraliev/SI_2023_lab2_213146/blob/master/graph1.jpg)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 10 + 1 = 11.

### Тест случаи според критериумот  Every Branch 
Тестираме различни inputs, и ги обележуваме гранките кои ќе се изминат
1) username=sotir, password = kako12345, email = null
1-2*
2-23*
1-3
3-4
4-5
3-5
5-6
6-14
6-7
7-8.1
8.1-8.2
8.2-9
9-10
10-11
11-12
10-12
12-13
13-8.3
8.3-8.2
8.2-14
14-15
15-16
16-23
17-18
18-22
22-23
18-19.1
19.1-19.2
19.2-20
20-21
21-23
20-19.3
19.3-19.2
19.2-22

2) username=null, password = kako, email = sotir.sobraliev@gmail.com
1-2
2-23
1-3*
3-4*
4-5*
3-5
5-6*
6-14
6-7*
7-8.1*
8.1-8.2*
8.2-9*
9-10*
10-11*
11-12*
10-12
12-13*
13-8.3*
8.3-8.2
8.2-14*
14-15
15-16
16-23*
17-18
18-22
22-23
18-19.1
19.1-19.2
19.2-20
20-21
21-23
20-19.3
19.3-19.2
19.2-22

3) username=boris, password = 123 23123, email = elizagmail.com
1-2
2-23
1-3*
3-4
4-5
3-5*
5-6*
6-14*
6-7
7-8.1
8.1-8.2
8.2-9
9-10
10-11
11-12
10-12
12-13
13-8.3
8.3-8.2
8.2-14
14-15*
15-16*
16-23
17-18
18-22
22-23
18-19.1
19.1-19.2
19.2-20
20-21
21-23
20-19.3
19.3-19.2
19.2-22

4) username=damjan, password = 383, email = markomarkov@gmail.com
1-2
2-23
1-3*
3-4
4-5
3-5*
5-6
6-14
6-7
7-8.1
8.1-8.2
8.2-9
9-10*
10-11*
11-12*
10-12
12-13
13-8.3
8.3-8.2
8.2-14*
14-15*
15-16*
16-23*
17-18
18-22
22-23
18-19.1
19.1-19.2
19.2-20
20-21
21-23
20-19.3
19.3-19.2
19.2-22

5) username=petko, password = str ne@ww1, email = marce@gmail.com
1-2
2-23
1-3*
3-4*
4-5*
3-5
5-6*
6-14
6-7*
7-8.1*
8.1-8.2*
8.2-9*
9-10*
10-11*
11-12*
10-12
12-13*
13-8.3*
8.3-8.2*
8.2-14*
14-15*
15-16*
16-23
17-18*
18-22*
22-23*
18-19.1
19.1-19.2
19.2-20
20-21
21-23
20-19.3
19.3-19.2
19.2-22


### Тест случаи според критериумот Multiple Condition
if (user==null || user.getPassword()==null || user.getEmail()==null)
Combination         Possible Test Case                         Branch
TXX                   user1=null                                1-2  - првиот услов се исполнува (нема потреба од дополнителен преглед)
FTX                   user1=("Sotir", null, "sotir@gmail.com"   1-2  - вториот услов се исплонува (нема потреба од дополнителен преглед)
FFT                   user1=("Boris", "zdravo513", null)        1-2  - третиот услов се исполнува
FFF          user1=("Zdravce", "hello353", "zdravko@gmail.com") 1-3  - ниеден услов не се исполнува

Овде ги споредивме можните тест случаеви за сите комбинации на овој услов.
Во моментот кога еден од условите ќе биде исполнет бидејќи е или || не се проверуваат понатаму, така например кога првиот услов за user==null е исполнет веднаш се премина на дадената гранка и нема потреба од дополнителни проверки.
### Објаснување на напишаните unit tests

...
...

