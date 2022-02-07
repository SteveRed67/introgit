package compistionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainerMain {

    public static void main(String[] args) {

//        Trainer trainer = new Trainer( "John Doe");
//
        List<Address> addresses = new ArrayList<>(Arrays.asList(
                new Address("Budapest","Váci utca"),
                new Address("Pécs","Fő út")
        ));
//        trainer.setAddresses(addresses);
//        System.out.println(trainer.getAddresses().get(0).getCity());
//        System.out.println(trainer.getAddresses().get(1).getCity());
//
//        trainer.getAddresses().add(new Address("Szeged","Tó tér"));
//        System.out.println(trainer.getAddresses().get(2).getCity());

//        Trainer trainer = new Trainer( "John Doe");
//        trainer.getAddresses().add(new Address("Budapest","Tó utca"));
//        trainer.addAddress(new Address("Elek", "Jó utca"));
//        System.out.println(trainer.getAddresses().get(0).getCity());
//        System.out.println(trainer.getAddresses().get(1).getCity());

        Trainer trainer = new Trainer( "John Doe",addresses);
        System.out.println(trainer.getAddresses().get(0).getCity());
        System.out.println(trainer.getAddresses().get(1).getLine1());
    }
}
