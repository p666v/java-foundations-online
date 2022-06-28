package ru.itsjava.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Birds {
    private final String typ;
    private final String group;
    private String view;

//    public Birds(String typ, String group, String view) {
//        this.typ = typ;
//        this.group = group;
//        this.view = view;
//    }

//    public String getView() {
//        return view;
//    }
//
//    public void setView(String view) {
//        this.view = view;
//    }

    public void speak() {
        System.out.println("Чик - чирик");
    }

    @Override
    public String toString() {
        return "Тип " + typ + ", группа " + group + ", вид " + view;
    }


}
