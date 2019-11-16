package scrap.heap.refactor;

import scrap.heap.refactor.dispatcher.IOrderDispatcher;
import scrap.heap.refactor.dispatcher.OrderDispatcherFactory;
import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.Orderable;
import scrap.heap.refactor.processor.OrderProcessor;

public class App {
    public static void main(String[] args) {
        IOrderDispatcher orderDispatcher = OrderDispatcherFactory.getDispatcher(OrderDispatcherFactory.Type.DEFAULT);

        Orderable smallVanillaCake = new Cake.Builder()
                .setFlavor(Cake.Flavor.CHOCOLATE)
                .setFrostingFlavor(Cake.Flavor.CHOCOLATE)
                .setShape(Cake.Shape.CIRCLE)
                .setSize(Cake.Size.LARGE)
                .setColor(Cake.Color.BROWN)
                .build();

        Orderable redMylarBalloon = new Balloon.Builder()
                .setColor(Balloon.Color.RED)
                .setMaterial(Balloon.Material.MYLAR)
                .setNumber(4)
                .build();

        OrderProcessor partyOne = new OrderProcessor(orderDispatcher);
        partyOne.addItems(redMylarBalloon, smallVanillaCake);
        partyOne.processOrder();

        Orderable mediumChocolateCake = new Cake.Builder()
                .setFlavor(Cake.Flavor.VANILLA)
                .setFrostingFlavor(Cake.Flavor.CHOCOLATE)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.MEDIUM)
                .setColor(Cake.Color.BROWN)
                .build();

        Orderable blueLatexBalloon = new Balloon.Builder()
                .setColor(Balloon.Color.BLUE)
                .setMaterial(Balloon.Material.LATEX)
                .setNumber(7)
                .build();

        OrderProcessor partyTwo = new OrderProcessor(orderDispatcher);
        partyTwo.addItems(blueLatexBalloon, mediumChocolateCake);
        partyTwo.processOrder();

        Orderable largeChocolateCake = new Cake.Builder()
                .setFlavor(Cake.Flavor.VANILLA)
                .setFrostingFlavor(Cake.Flavor.VANILLA)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.SMALL)
                .setColor(Cake.Color.YELLOW)
                .build();

        Orderable yellowMylarBalloon = new Balloon.Builder()
                .setColor(Balloon.Color.YELLOW)
                .setMaterial(Balloon.Material.MYLAR)
                .setNumber(4)
                .build();

        OrderProcessor partyThree = new OrderProcessor(orderDispatcher);
        partyThree.addItems(yellowMylarBalloon, largeChocolateCake);
        partyThree.processOrder();
    }
}
