package scrap.heap.refactor;

import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Size;
import scrap.heap.refactor.dispatcher.IOrderDispatcher;
import scrap.heap.refactor.dispatcher.OrderDispatcherFactory;
import scrap.heap.refactor.model.balloon.Balloon;
import scrap.heap.refactor.model.cake.Cake;
import scrap.heap.refactor.model.flavor.Chocolate;
import scrap.heap.refactor.model.flavor.Flavor;
import scrap.heap.refactor.model.flavor.Vanilla;
import scrap.heap.refactor.model.material.Latex;
import scrap.heap.refactor.model.material.MyLar;
import scrap.heap.refactor.model.shape.Circle;
import scrap.heap.refactor.model.shape.Square;
import scrap.heap.refactor.order.Order;
import scrap.heap.refactor.order.Orderable;
import scrap.heap.refactor.processor.OrderProcessor;

public class App {
    public static void main(String[] args) {
        IOrderDispatcher orderDispatcher = OrderDispatcherFactory.getDispatcher(OrderDispatcherFactory.Type.DEFAULT);

        Orderable smallVanillaCake = new Cake.Builder()
                .setFlavor(new Chocolate())
                .setFrostingFlavor(new Chocolate())
                .setShape(new Circle())
                .setSize(Size.LARGE)
                .setColor(Color.BROWN)
                .build();

        Orderable redMylarBalloon = new Balloon.Builder()
                .setColor(Color.RED)
                .setMaterial(new MyLar())
                .setNumber(4)
                .build();

        OrderProcessor partyOne = new OrderProcessor(orderDispatcher);
        Order orderOne = new Order();
        orderOne.addItems(redMylarBalloon, smallVanillaCake);
        partyOne.processOrder(orderOne);

        Orderable mediumChocolateCake = new Cake.Builder()
                .setFlavor(new Vanilla())
                .setFrostingFlavor(new Chocolate())
                .setShape(new Square())
                .setSize(Size.MEDIUM)
                .setColor(Color.BROWN)
                .build();

        Orderable blueLatexBalloon = new Balloon.Builder()
                .setColor(Color.BLUE)
                .setMaterial(new Latex())
                .setNumber(7)
                .build();

        OrderProcessor partyTwo = new OrderProcessor(orderDispatcher);
        Order orderTwo = new Order();
        orderTwo.addItems(blueLatexBalloon, mediumChocolateCake);
        partyTwo.processOrder(orderTwo);

        Orderable largeChocolateCake = new Cake.Builder()
                .setFlavor(new Vanilla())
                .setFrostingFlavor(new Vanilla())
                .setShape(new Square())
                .setSize(Size.SMALL)
                .setColor(Color.YELLOW)
                .build();

        Orderable yellowMylarBalloon = new Balloon.Builder()
                .setColor(Color.YELLOW)
                .setMaterial(new MyLar())
                .setNumber(4)
                .build();

        OrderProcessor partyThree = new OrderProcessor(orderDispatcher);
        Order orderThree = new Order();
        orderThree.addItems(yellowMylarBalloon, largeChocolateCake);
        partyThree.processOrder(orderThree);
    }
}
