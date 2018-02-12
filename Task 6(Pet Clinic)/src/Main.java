import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
* Создать программу для обслуживания клиники домашних питомцев.
*
* Должна быть возможно добавлять клиентов.+
* Указывать какой питомец есть у клиента.+
* Возможность искать по кличке питомца, по имени клиента.
*
* Редактировать имя клиента, имя питомца.
* Удалять клиента, питомца.
* Возможность валидации.
*/
    public static void main(String[] args) {
        ArrayList <Client> clinic=new ArrayList<Client>();
        clinic.add(new Client("Ігор",new Dog("Рудік")));
        clinic.add(new Client("Тарас",new Dog("Чарлі")));
        clinic.add(new Client("Сергій",new Cat("Рижик")));
        clinic.add(new Client("Олег",new Cat("Чарлі")));
        clinic.add(new Client("Василь",new Animal("Рудік")));
        clinic.add(new Client("Оксана",new Animal("Афоня")));
        clinic.add(new Client("Уляна",new Dog("Афоня")));
        Scanner reader=new Scanner(System.in);
        String exit="no";
        while(!exit.equals("exit")){
            System.out.println("Виберіть дію");
            System.out.println("1- Додати клієнта");
            System.out.println("2- Пошук");
            switch (Integer.parseInt(reader.next())) {
                case 1:
                    System.out.println("Введіть ім'я клієнта");
                    String clientName=reader.next();
                    System.out.println("Виберіть тип тваринки");
                    System.out.println("1- Собака");
                    System.out.println("2- Кіт");
                    System.out.println("3- Інший");
                    switch (Integer.parseInt(reader.next())){
                        case 1:
                            System.out.println("Введіть ім'я собаки");
                            clinic.add(new Client(clientName,new Dog(reader.next())));
                            break;
                        case 2:
                            System.out.println("Введіть ім'я кота");
                            clinic.add(new Client(clientName,new Cat(reader.next())));
                            break;
                        case 3:
                            System.out.println("Введіть ім'я тварини");
                            clinic.add(new Client(clientName,new Animal(reader.next())));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Виберіть тип пошуку");
                    System.out.println("1- По імені клієнта");
                    System.out.println("2- По імені тваринки");
                    switch (Integer.parseInt(reader.next()))
                    {
                        case 1:
                            System.out.println("Введіть ім'я клієнта");
                            clientName=reader.next();
                            for(int i=0;i<clinic.size();i++)
                            {
                                if(clientName.equals(clinic.get(i).getId())){
                                    System.out.println(clinic.get(i).getId());
                                    System.out.println(clinic.get(i).getPet().getName());
                                    clinic.get(i).getPet().makeSound();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Введіть ім'я тварини");
                            String animalName=reader.next();
                            for(int i=0;i<clinic.size();i++)
                            {
                                if(animalName.equals(clinic.get(i).getPet().getName())){
                                    System.out.println(clinic.get(i).getId());
                                    System.out.println(clinic.get(i).getPet().getName());
                                    clinic.get(i).getPet().makeSound();
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("3");
                    break;
            }
            System.out.println("Якщо хочете вийти введіть- exit, якщо ні то введіть- no");
            exit=reader.next();
        }
    }
}
