package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Entities.IHotDrink;
import org.javatuples.Pair;
import org.reflections.Reflections;

public class HotDrinkMachine {

    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {

        // find all implementors of IHotDrinkFactory
        Set<Class<? extends IHotDrinkFactory>> types =
                new Reflections("Service").getSubTypesOf(IHotDrinkFactory.class);

        for(Class<? extends IHotDrinkFactory> type : types){
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public IHotDrink makeDrink() throws IOException{
        System.out.println("Available drinks");
        for(int index = 0; index < namedFactories.size(); ++index){
            Pair<String, IHotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){

            String s;
            int i, amount;
            if((s = reader.readLine()) != null
                && (i = Integer.parseInt(s)) >= 0
                && i < namedFactories.size()){

                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0){
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorect input, try again.");
        }
    }

}
