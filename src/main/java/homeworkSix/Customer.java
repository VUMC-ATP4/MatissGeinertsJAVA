package homeworkSix;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

    private String name;
    private boolean member;
    private String memberType;


    @NonNull


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
