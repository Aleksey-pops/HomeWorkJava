package Cat.TypesOfData;

public class Cat {

    String name;
    String poroda;
    String owner;
    int age;

    @Override
    public String toString() {
        return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) { // ссылка типа обджект
        if (this == obj) { // если ссылки равны проверяем
            return true;
        }
        if (!(obj instanceof Cat)) { // если объект не кот проверяем
            return false;
        }
        Cat cat = (Cat) obj; // кастуем объект присваиваем приводим к типу Cat сам обьект не меняется
        return name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals((cat.owner));
    }

    @Override
    public int hashCode() { // функция приведения к числу колизии одинаковый хеш код
        return name.hashCode() + 7 * poroda.hashCode() + 13 * age + 17 * owner.hashCode(); //переводим в числа
    }
}

