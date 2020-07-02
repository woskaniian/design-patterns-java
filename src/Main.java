
public class Main {
    public static void main(String[] args) {
        testCreationals();
        testStructurals();
        testBehaviorals();
    }

    public static void testCreationals() {
        System.out.println("Testing creational patterns");
        testLazySingleton();
        testEagerSingleton();
        testPrototype();
        testFactoryMethod();
        testAbstractFactory();
        testBuilder();
    }


    public static void testLazySingleton() {
        System.out.println("Testing lazy singleton");
        creational.singleton.LazySingleton singleton1 = creational.singleton.LazySingleton.getInstance();
        creational.singleton.LazySingleton singleton2 = creational.singleton.LazySingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println();
    }

    public static void testEagerSingleton() {
        System.out.println("Testing eager singleton");
        creational.singleton.EagerSingleton singleton1 = creational.singleton.EagerSingleton.getInstance();
        creational.singleton.EagerSingleton singleton2 = creational.singleton.EagerSingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println();
    }

    private static void testPrototype() {
        System.out.println("Testing prototype");
        long instantiationStartTime = System.nanoTime();
        creational.prototype.PrototypeCapable prototype = new creational.prototype.PrototypeCapableProduct("Field1Value", "Field2Value", 1, 2);
        long instantiationEndTime = System.nanoTime();
        long prototypingStartTime = 0;
        long prototypingEndTime = 0;
        creational.prototype.PrototypeCapable product = null;
        try {
            prototypingStartTime = System.nanoTime();
            product = prototype.clone();
            prototypingEndTime = System.nanoTime();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(prototype);
        System.out.println(product);
        System.out.println("Time taken for instantiation: " + (instantiationEndTime - instantiationStartTime));
        System.out.println("Time taken for prototyping: " + (prototypingEndTime - prototypingStartTime));
        System.out.println();
    }

    public static void testFactoryMethod() {
        System.out.println("Testing factory method");
        creational.factoryMethod.AbstractProduct product1 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.First);
        creational.factoryMethod.AbstractProduct product2 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.Second);
        creational.factoryMethod.AbstractProduct product3 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.Third);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();
    }

    public static void testAbstractFactory() {
        System.out.println("Testing abstract factory");
        creational.abstractFactory.AbstractProduct productCreatedWithInnerDecision =
                creational.abstractFactory.ProductFactory.createProduct();
        creational.abstractFactory.AbstractProduct productCreatedWithOuterDecision =
                creational.abstractFactory.ProductFactory.createProduct(new creational.abstractFactory.FirstConcreteProductFactory());
        System.out.println(productCreatedWithInnerDecision);
        System.out.println(productCreatedWithOuterDecision);
        System.out.println();
    }

    public static void testBuilder() {
        System.out.println("Testing builder");
        creational.builder.Product.ProductBuilder builder = new creational.builder.Product.ProductBuilder("ReqField1Value", "ReqField2Value");
        creational.builder.Product product = builder
                .optionalField1("OptField1Value")
                .optionalField3("OptField3Value")
                .build();
        System.out.println(product);
        System.out.println();
    }

    public static void testStructurals() {
        System.out.println("Testing structural patterns");
        testAdapter();
        testBridge();
        testComposite();
        testDecorator();
        testFacade();
        testFlyweight();
        testProxy();
    }

    private static void testDecorator() {
        System.out.println("Testing decorator");
        structural.decorator.Component component = new structural.decorator.ConcreteComponent("data");
        structural.decorator.Component decoratedComponent = new structural.decorator.ConcreteDecorator(component);
        System.out.println(component);
        System.out.println(decoratedComponent);
        System.out.println(component.getSomeData());
        System.out.println(decoratedComponent.getSomeData());
        System.out.println();
    }

    private static void testAdapter() {
        System.out.println("Testing adapter");
        structural.adapter.ServiceAdapter compositeServiceAdapter = new structural.adapter.CompositeServiceAdapter(new structural.adapter.ServiceAdaptee());
        structural.adapter.ServiceAdapter inheritedServiceAdapter = new structural.adapter.InheritedServiceAdapter();
        System.out.println(compositeServiceAdapter.getSomeInfo());
        System.out.println(compositeServiceAdapter.getSomeInfo2());
        System.out.println(inheritedServiceAdapter.getSomeInfo());
        System.out.println(inheritedServiceAdapter.getSomeInfo2());
        System.out.println();
    }

    private static void testBridge() {
        System.out.println("Testing bridge");
        structural.bridge.FileDownloaderAbstraction windowsFileDownloader = new structural.bridge.FileDownloaderAbstractionImpl(new structural.bridge.WindowsFileDownloadImplementor());
        structural.bridge.FileDownloaderAbstraction linuxFileDownloader = new structural.bridge.FileDownloaderAbstractionImpl(new structural.bridge.LinuxFileDownloadImplementor());
        Object windowsDownloadedObject = windowsFileDownloader.download("https://example.com");
        windowsFileDownloader.store(windowsDownloadedObject);
        Object linuxDownloadedObject = linuxFileDownloader.download("https://example.com");
        linuxFileDownloader.store(linuxDownloadedObject);
        System.out.println();
    }

    private static void testComposite() {
        System.out.println("Testing composite");
        // Creating structure
        structural.composite.Composite composite1 = new structural.composite.Composite("Field1Value0", "Field1Value0", "Field1Value0");
        structural.composite.Composite composite2 = new structural.composite.Composite("Field1Value1", "Field1Value1", "Field1Value1");
        structural.composite.Composite composite3 = new structural.composite.Composite("Field1Value2", "Field1Value2", "Field1Value2");
        composite1.addChild(composite2);
        composite1.addChild(composite3);
        structural.composite.Component leaf1 = new structural.composite.Leaf("Field1Value1", "Field2Value1");
        structural.composite.Component leaf2 = new structural.composite.Leaf("Field1Value2", "Field2Value2");
        composite2.addChild(leaf1);
        composite2.addChild(leaf2);
        structural.composite.Component leaf3 = new structural.composite.Leaf("Field1Value3", "Field2Value3");
        structural.composite.Component leaf4 = new structural.composite.Leaf("Field1Value4", "Field2Value4");
        composite3.addChild(leaf3);
        composite3.addChild(leaf4);
        // Calling method as component
        ((structural.composite.Component) composite1).doSomething();
        System.out.println();
    }

    private static void testFacade() {
        System.out.println("Testing facade");
        structural.facade.Report report1 = structural.facade.ReportHelperFacade.generateReport("Title", "ContentOfReport", structural.facade.ReportType.First);
        structural.facade.Report report2 = structural.facade.ReportHelperFacade.generateReport("Title", "ContentOfReport", structural.facade.ReportType.Second);
        structural.facade.ReportHelperFacade.printReport(report1, structural.facade.ReportFormat.HTML);
        structural.facade.ReportHelperFacade.printReport(report2, structural.facade.ReportFormat.PDF);
        structural.facade.ReportHelperFacade.printReport(report2, structural.facade.ReportFormat.TXT);
        System.out.println();
    }

    private static void testProxy() {
        System.out.println("Testing proxy");
        structural.proxy.Subject subjectProxyUsingComposition = new structural.proxy.SubjectProxyUsingComposition();
        structural.proxy.Subject subjectProxyUsingInheritance = new structural.proxy.SubjectProxyUsingInheritance();
        subjectProxyUsingComposition.doSomething();
        subjectProxyUsingInheritance.doSomething();
        System.out.println();
    }

    private static void testFlyweight() {
        System.out.println("Testing flyweight");
        structural.flyweight.AbstractProduct product1 = structural.flyweight.FlyweightProductFactory.getProduct(structural.flyweight.ProductType.First);
        structural.flyweight.AbstractProduct product2 = structural.flyweight.FlyweightProductFactory.getProduct(structural.flyweight.ProductType.First);
        structural.flyweight.AbstractProduct product3 = structural.flyweight.FlyweightProductFactory.getProduct(structural.flyweight.ProductType.Second);
        structural.flyweight.AbstractProduct product4 = structural.flyweight.FlyweightProductFactory.getProduct(structural.flyweight.ProductType.Second);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println();
    }

    public static void testBehaviorals() {
        testChainOfResponsibility();
        testCommand();
        testIterator();
        testMediator();
        testMemento();
        testObserver();
        testState();
    }

    private static void testState() {
        System.out.println("Testing state");
        behavioral.state.State state1 = new behavioral.state.FirstConcreteState();
        behavioral.state.State state2 = new behavioral.state.SecondConcreteState();
        behavioral.state.Context context = new behavioral.state.Context(state1);
        context.doSomeStateDependentWork();
        context.setState(state2);
        context.doSomeStateDependentWork();
        System.out.println();
    }

    private static void testObserver() {
        System.out.println("Testing observer");
        behavioral.observer.Observer observer1 = new behavioral.observer.ConcreteObserver();
        behavioral.observer.Observer observer2 = new behavioral.observer.ConcreteObserver();
        behavioral.observer.Observable observable = new behavioral.observer.ConcreteObservable();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        ((behavioral.observer.ConcreteObservable) observable).setField1("Field1Value");
        ((behavioral.observer.ConcreteObservable) observable).setField2("Field2Value");
        System.out.println();
    }

    private static void testMemento() {
        System.out.println("Testing memento");
        behavioral.memento.Originator originator = new behavioral.memento.Originator("Initial value", 1, false);
        behavioral.memento.Caretaker caretaker = new behavioral.memento.Caretaker();
        caretaker.save(originator);
        System.out.println("Initial state of originator : " + originator.toString());
        originator.setField1("Changed value");
        originator.setField2(2);
        originator.setField3(true);
        System.out.println("Changed state of originator : " + originator.toString());
        caretaker.undo(originator);
        System.out.println("Restored state of originator : " + originator.toString());
        System.out.println();
    }

    private static void testMediator() {
        System.out.println("Testing mediator");
        behavioral.mediator.Mediator mediator = new behavioral.mediator.ConcreteMediator();
        behavioral.mediator.Colleague colleague1 = new behavioral.mediator.ConcreteColleague(1, "Bob", mediator);
        behavioral.mediator.Colleague colleague2 = new behavioral.mediator.ConcreteColleague(2, "John", mediator);
        behavioral.mediator.Colleague colleague3 = new behavioral.mediator.ConcreteColleague(3, "Alice", mediator);
        mediator.add(colleague1);
        mediator.add(colleague2);
        mediator.add(colleague3);
        colleague3.send("Hello", "Bob");
        colleague2.send("How are you?", "Alice");
        colleague1.send("Bye", "John");
        System.out.println();
    }

    private static void testIterator() {
        System.out.println("Testing iterator");
        behavioral.iterator.Collection<String> collection = new behavioral.iterator.ConcreteCollection<>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Forth");
        collection.add("Fifth");
        System.out.println(collection);
        behavioral.iterator.Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    private static void testCommand() {
        System.out.println("Testing command");
        behavioral.command.FirstReceiver firstReceiver = new behavioral.command.FirstReceiver();
        behavioral.command.SecondReceiver secondReceiver = new behavioral.command.SecondReceiver();
        behavioral.command.Command firstCommand = new behavioral.command.FirstCommand(firstReceiver);
        behavioral.command.Command secondCommand = new behavioral.command.SecondCommand(secondReceiver);
        behavioral.command.Invoker invoker = new behavioral.command.Invoker();
        invoker.setCommand(firstCommand);
        invoker.invoke();
        invoker.setCommand(secondCommand);
        invoker.invoke();
        System.out.println();
    }

    private static void testChainOfResponsibility() {
        System.out.println("Testing chain of responsibility");
        // Setting up chain
        behavioral.chainOfResponsibility.FrontDeskSupport frontDeskSupportHandler =
                new behavioral.chainOfResponsibility.FrontDeskSupport();
        behavioral.chainOfResponsibility.SupervisorSupport supervisorSupportHandler =
                new behavioral.chainOfResponsibility.SupervisorSupport();
        behavioral.chainOfResponsibility.ManagerSupport managerSupportHandler =
                new behavioral.chainOfResponsibility.ManagerSupport();
        behavioral.chainOfResponsibility.DirectorSupport directorSupportHandler =
                new behavioral.chainOfResponsibility.DirectorSupport();
        behavioral.chainOfResponsibility.SupportServiceImpl supportService =
                new behavioral.chainOfResponsibility.SupportServiceImpl();
        supportService.setHandler(frontDeskSupportHandler);
        frontDeskSupportHandler.setNext(supervisorSupportHandler);
        supervisorSupportHandler.setNext(managerSupportHandler);
        managerSupportHandler.setNext(directorSupportHandler);
        // Testing the chain with making requests to handler
        behavioral.chainOfResponsibility.ServiceRequest request = new behavioral.chainOfResponsibility.ServiceRequest();
        request.setType(behavioral.chainOfResponsibility.ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new behavioral.chainOfResponsibility.ServiceRequest();
        request.setType(behavioral.chainOfResponsibility.ServiceLevel.LEVEL_THREE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        try {
            request = new behavioral.chainOfResponsibility.ServiceRequest();
            request.setType(behavioral.chainOfResponsibility.ServiceLevel.INVALID_REQUEST);
            supportService.handleRequest(request);
            System.out.println(request.getConclusion());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
