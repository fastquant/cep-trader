// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package com.algoTrader.entity;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>com.algoTrader.entity.Tick</code>.
 * </p>
 *
 * @see com.algoTrader.entity.Tick
 */
public abstract class TickDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements com.algoTrader.entity.TickDao
{

    private com.algoTrader.entity.SecurityDao securityDao;

    /**
     * Sets the reference to <code>securityDao</code>.
     */
    public void setSecurityDao(com.algoTrader.entity.SecurityDao securityDao)
    {
        this.securityDao = securityDao;
    }

    /**
     * Gets the reference to <code>securityDao</code>.
     */
    protected com.algoTrader.entity.SecurityDao getSecurityDao()
    {
        return this.securityDao;
    }

    /**
     * @see com.algoTrader.entity.TickDao#load(int, int)
     */
    public java.lang.Object load(final int transform, final int id)
    {
        final java.lang.Object entity = this.getHibernateTemplate().get(com.algoTrader.entity.TickImpl.class, new java.lang.Integer(id));
        return transformEntity(transform, (com.algoTrader.entity.Tick)entity);
    }

    /**
     * @see com.algoTrader.entity.TickDao#load(int)
     */
    public com.algoTrader.entity.Tick load(int id)
    {
        return (com.algoTrader.entity.Tick)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see com.algoTrader.entity.TickDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see com.algoTrader.entity.TickDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(com.algoTrader.entity.TickImpl.class);
        this.transformEntities(transform, results);
        return results;
    }


    /**
     * @see com.algoTrader.entity.TickDao#create(com.algoTrader.entity.Tick)
     */
    public com.algoTrader.entity.Tick create(com.algoTrader.entity.Tick tick)
    {
        return (com.algoTrader.entity.Tick)this.create(TRANSFORM_NONE, tick);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(int transform, com.algoTrader.entity.Tick)
     */
    public java.lang.Object create(final int transform, final com.algoTrader.entity.Tick tick)
    {
        if (tick == null)
        {
            throw new IllegalArgumentException(
                "Tick.create - 'tick' can not be null");
        }
        this.getHibernateTemplate().save(tick);
        return this.transformEntity(transform, tick);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Tick.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (com.algoTrader.entity.Tick)entityIterator.next());
                    }
                    return null;
                }
            });
        return entities;
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(java.util.Date, java.math.BigDecimal, java.util.Date, int, int, int, java.math.BigDecimal, java.math.BigDecimal, int, java.math.BigDecimal)
     */
    public com.algoTrader.entity.Tick create(
        java.util.Date dateTime,
        java.math.BigDecimal last,
        java.util.Date lastDateTime,
        int vol,
        int volBid,
        int volAsk,
        java.math.BigDecimal bid,
        java.math.BigDecimal ask,
        int openIntrest,
        java.math.BigDecimal settlement)
    {
        return (com.algoTrader.entity.Tick)this.create(TRANSFORM_NONE, dateTime, last, lastDateTime, vol, volBid, volAsk, bid, ask, openIntrest, settlement);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(int, java.util.Date, java.math.BigDecimal, java.util.Date, int, int, int, java.math.BigDecimal, java.math.BigDecimal, int, java.math.BigDecimal)
     */
    public java.lang.Object create(
        final int transform,
        java.util.Date dateTime,
        java.math.BigDecimal last,
        java.util.Date lastDateTime,
        int vol,
        int volBid,
        int volAsk,
        java.math.BigDecimal bid,
        java.math.BigDecimal ask,
        int openIntrest,
        java.math.BigDecimal settlement)
    {
        com.algoTrader.entity.Tick entity = new com.algoTrader.entity.TickImpl();
        entity.setDateTime(dateTime);
        entity.setLast(last);
        entity.setLastDateTime(lastDateTime);
        entity.setVol(vol);
        entity.setVolBid(volBid);
        entity.setVolAsk(volAsk);
        entity.setBid(bid);
        entity.setAsk(ask);
        entity.setOpenIntrest(openIntrest);
        entity.setSettlement(settlement);
        return this.create(transform, entity);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(java.math.BigDecimal, java.math.BigDecimal, java.util.Date, int, com.algoTrader.entity.Security, int, int, int)
     */
    public com.algoTrader.entity.Tick create(
        java.math.BigDecimal ask,
        java.math.BigDecimal bid,
        java.util.Date dateTime,
        int openIntrest,
        com.algoTrader.entity.Security security,
        int vol,
        int volAsk,
        int volBid)
    {
        return (com.algoTrader.entity.Tick)this.create(TRANSFORM_NONE, ask, bid, dateTime, openIntrest, security, vol, volAsk, volBid);
    }

    /**
     * @see com.algoTrader.entity.TickDao#create(int, java.math.BigDecimal, java.math.BigDecimal, java.util.Date, int, com.algoTrader.entity.Security, int, int, int)
     */
    public java.lang.Object create(
        final int transform,
        java.math.BigDecimal ask,
        java.math.BigDecimal bid,
        java.util.Date dateTime,
        int openIntrest,
        com.algoTrader.entity.Security security,
        int vol,
        int volAsk,
        int volBid)
    {
        com.algoTrader.entity.Tick entity = new com.algoTrader.entity.TickImpl();
        entity.setAsk(ask);
        entity.setBid(bid);
        entity.setDateTime(dateTime);
        entity.setOpenIntrest(openIntrest);
        entity.setSecurity(security);
        entity.setVol(vol);
        entity.setVolAsk(volAsk);
        entity.setVolBid(volBid);
        return this.create(transform, entity);
    }

    /**
     * @see com.algoTrader.entity.TickDao#update(com.algoTrader.entity.Tick)
     */
    public void update(com.algoTrader.entity.Tick tick)
    {
        if (tick == null)
        {
            throw new IllegalArgumentException(
                "Tick.update - 'tick' can not be null");
        }
        this.getHibernateTemplate().update(tick);
    }

    /**
     * @see com.algoTrader.entity.TickDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Tick.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((com.algoTrader.entity.Tick)entityIterator.next());
                    }
                    return null;
                }
            });
    }

    /**
     * @see com.algoTrader.entity.TickDao#remove(com.algoTrader.entity.Tick)
     */
    public void remove(com.algoTrader.entity.Tick tick)
    {
        if (tick == null)
        {
            throw new IllegalArgumentException(
                "Tick.remove - 'tick' can not be null");
        }
        this.getHibernateTemplate().delete(tick);
    }

    /**
     * @see com.algoTrader.entity.TickDao#remove(int)
     */
    public void remove(int id)
    {
        com.algoTrader.entity.Tick entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see com.algoTrader.entity.TickDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Tick.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * @see com.algoTrader.entity.TickDao#findLastTickForSecurityAndMaxDate(int, java.util.Date)
     */
    public com.algoTrader.entity.Tick findLastTickForSecurityAndMaxDate(int securityId, java.util.Date maxDate)
    {
        return (com.algoTrader.entity.Tick)this.findLastTickForSecurityAndMaxDate(TRANSFORM_NONE, securityId, maxDate);
    }

    /**
     * @see com.algoTrader.entity.TickDao#findLastTickForSecurityAndMaxDate(java.lang.String, int, java.util.Date)
     */
    public com.algoTrader.entity.Tick findLastTickForSecurityAndMaxDate(final java.lang.String queryString, final int securityId, final java.util.Date maxDate)
    {
        return (com.algoTrader.entity.Tick)this.findLastTickForSecurityAndMaxDate(TRANSFORM_NONE, queryString, securityId, maxDate);
    }

    /**
     * @see com.algoTrader.entity.TickDao#findLastTickForSecurityAndMaxDate(int, int, java.util.Date)
     */
    public java.lang.Object findLastTickForSecurityAndMaxDate(final int transform, final int securityId, final java.util.Date maxDate)
    {
        return this.findLastTickForSecurityAndMaxDate(transform, "select * from tick where security_fk = :securityId and date_time <= :maxDate order by date_time desc limit 1 ", securityId, maxDate);
    }

    /**
     * @see com.algoTrader.entity.TickDao#findLastTickForSecurityAndMaxDate(int, java.lang.String, int, java.util.Date)
     */
    public java.lang.Object findLastTickForSecurityAndMaxDate(final int transform, final java.lang.String queryString, final int securityId, final java.util.Date maxDate)
    {
        try
        {
            org.hibernate.SQLQuery queryObject = super.getSession(false).createSQLQuery(queryString);
			queryObject.addEntity(com.algoTrader.entity.TickImpl.class);
            queryObject.setParameter("securityId", new java.lang.Integer(securityId));
            queryObject.setParameter("maxDate", maxDate);
            java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
            java.lang.Object result = null;
            if (results != null)
            {
                if (results.size() > 1)
                {
                    throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
                        "More than one instance of 'com.algoTrader.entity.Tick"
                            + "' was found when executing query --> '" + queryString + "'");
                }
                else if (results.size() == 1)
                {
                    result = results.iterator().next();
                }
            }
            result = transformEntity(transform, (com.algoTrader.entity.Tick)result);
            return result;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>com.algoTrader.entity.TickDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link com.algoTrader.entity.Tick} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link com.algoTrader.vo.RawTickVO} - {@link TRANSFORM_RAWTICKVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link com.algoTrader.entity.TickDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final com.algoTrader.entity.Tick entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_RAWTICKVO :
                    target = toRawTickVO(entity);
                    break;
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,com.algoTrader.entity.Tick)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>com.algoTrader.entity.TickDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,com.algoTrader.entity.Tick)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_RAWTICKVO :
                toRawTickVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see com.algoTrader.entity.TickDao#toRawTickVOCollection(java.util.Collection)
     */
    public final void toRawTickVOCollection(java.util.Collection entities)
    {
        if (entities != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, RAWTICKVO_TRANSFORMER);
        }
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link TickDaoImpl} class if you intend to use reporting queries.
     * @see com.algoTrader.entity.TickDao#toRawTickVO(com.algoTrader.entity.Tick)
     */
    protected com.algoTrader.vo.RawTickVO toRawTickVO(java.lang.Object[] row)
    {
        com.algoTrader.vo.RawTickVO target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final java.lang.Object object = row[ctr];
                if (object instanceof com.algoTrader.entity.Tick)
                {
                    target = this.toRawTickVO((com.algoTrader.entity.Tick)object);
                    break;
                }
            }
        }
        return target;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link com.algoTrader.vo.RawTickVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer RAWTICKVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof com.algoTrader.entity.Tick)
                {
                    result = toRawTickVO((com.algoTrader.entity.Tick)input);
                }
                else if (input instanceof java.lang.Object[])
                {
                    result = toRawTickVO((java.lang.Object[])input);
                }
                return result;
            }
        };

    /**
     * @see com.algoTrader.entity.TickDao#rawTickVOToEntityCollection(java.util.Collection)
     */
    public final void rawTickVOToEntityCollection(java.util.Collection instances)
    {
        if (instances != null)
        {
            for (final java.util.Iterator iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof com.algoTrader.vo.RawTickVO))
                {
                    iterator.remove();
                }
            }
            org.apache.commons.collections.CollectionUtils.transform(instances, RawTickVOToEntityTransformer);
        }
    }

    private final org.apache.commons.collections.Transformer RawTickVOToEntityTransformer =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                return rawTickVOToEntity((com.algoTrader.vo.RawTickVO)input);
            }
        };


    /**
     * @see com.algoTrader.entity.TickDao#toRawTickVO(com.algoTrader.entity.Tick, com.algoTrader.vo.RawTickVO)
     */
    public void toRawTickVO(
        com.algoTrader.entity.Tick source,
        com.algoTrader.vo.RawTickVO target)
    {
        target.setDateTime(source.getDateTime());
        target.setLast(source.getLast());
        target.setLastDateTime(source.getLastDateTime());
        target.setVol(source.getVol());
        target.setVolBid(source.getVolBid());
        target.setVolAsk(source.getVolAsk());
        target.setBid(source.getBid());
        target.setAsk(source.getAsk());
        target.setOpenIntrest(source.getOpenIntrest());
        target.setSettlement(source.getSettlement());
    }

    /**
     * @see com.algoTrader.entity.TickDao#toRawTickVO(com.algoTrader.entity.Tick)
     */
    public com.algoTrader.vo.RawTickVO toRawTickVO(final com.algoTrader.entity.Tick entity)
    {
        final com.algoTrader.vo.RawTickVO target = new com.algoTrader.vo.RawTickVO();
        this.toRawTickVO(entity, target);
        return target;
    }
    
    /**
     * @see com.algoTrader.entity.TickDao#rawTickVOToEntity(com.algoTrader.vo.RawTickVO, com.algoTrader.entity.Tick)
     */
    public void rawTickVOToEntity(
        com.algoTrader.vo.RawTickVO source,
        com.algoTrader.entity.Tick target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getDateTime() != null)
        {
            target.setDateTime(source.getDateTime());
        }
        if (copyIfNull || source.getLast() != null)
        {
            target.setLast(source.getLast());
        }
        if (copyIfNull || source.getLastDateTime() != null)
        {
            target.setLastDateTime(source.getLastDateTime());
        }
        if (copyIfNull || source.getVol() != 0)
        {
            target.setVol(source.getVol());
        }
        if (copyIfNull || source.getVolBid() != 0)
        {
            target.setVolBid(source.getVolBid());
        }
        if (copyIfNull || source.getVolAsk() != 0)
        {
            target.setVolAsk(source.getVolAsk());
        }
        if (copyIfNull || source.getBid() != null)
        {
            target.setBid(source.getBid());
        }
        if (copyIfNull || source.getAsk() != null)
        {
            target.setAsk(source.getAsk());
        }
        if (copyIfNull || source.getOpenIntrest() != 0)
        {
            target.setOpenIntrest(source.getOpenIntrest());
        }
        if (copyIfNull || source.getSettlement() != null)
        {
            target.setSettlement(source.getSettlement());
        }
    }
    
}