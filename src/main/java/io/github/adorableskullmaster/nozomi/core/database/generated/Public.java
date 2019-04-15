/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated;


import io.github.adorableskullmaster.nozomi.core.database.generated.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Public extends SchemaImpl {

  /**
   * The reference instance of <code>public</code>
   */
  public static final Public PUBLIC = new Public();
  private static final long serialVersionUID = -2055724119;
  /**
   * The table <code>public.applicants</code>.
   */
  public final Applicants APPLICANTS = io.github.adorableskullmaster.nozomi.core.database.generated.tables.Applicants.APPLICANTS;

  /**
   * The table <code>public.channels</code>.
   */
  public final Channels CHANNELS = io.github.adorableskullmaster.nozomi.core.database.generated.tables.Channels.CHANNELS;

  /**
   * The table <code>public.guilds</code>.
   */
  public final Guilds GUILDS = io.github.adorableskullmaster.nozomi.core.database.generated.tables.Guilds.GUILDS;

  /**
   * The table <code>public.texts</code>.
   */
  public final Texts TEXTS = io.github.adorableskullmaster.nozomi.core.database.generated.tables.Texts.TEXTS;

  /**
   * The table <code>public.wars</code>.
   */
  public final Wars WARS = io.github.adorableskullmaster.nozomi.core.database.generated.tables.Wars.WARS;

  /**
   * No further instances allowed
   */
  private Public() {
    super("public", null);
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public Catalog getCatalog() {
    return DefaultCatalog.DEFAULT_CATALOG;
  }

  @Override
  public final List<Table<?>> getTables() {
    List result = new ArrayList();
    result.addAll(getTables0());
    return result;
  }

  private final List<Table<?>> getTables0() {
    return Arrays.<Table<?>>asList(
        Applicants.APPLICANTS,
        Channels.CHANNELS,
        Guilds.GUILDS,
        Texts.TEXTS,
        Wars.WARS);
  }
}