package modules;

import com.dheeraj.dbProvider.MongoProvider;
import com.google.inject.AbstractModule;
import com.typesafe.config.Config;
import org.mongodb.morphia.Datastore;
import play.Environment;
import utils.Constants;

import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: Dheeraj Reddy
 * Date: 18/06/18
 */

public class EkartCustomerModule extends AbstractModule {

    private Config config;

    @Inject
    public EkartCustomerModule(Environment environment, Config config) {
        this.config = config;
    }

    @Override
    protected void configure() {
        bind(Datastore.class).toInstance(new MongoProvider(config, Constants.context).getDatastore());
    }
}
