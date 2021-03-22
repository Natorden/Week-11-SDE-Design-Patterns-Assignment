# Week-11-SDE-Assignment
 Design patterns assignment for week 11

This is by Rolf Geschke of class CSe_20B
It should include a Facade, Singleton and Strategy Patterns.
To switch between the Database saving and local saving, in the DALFacade class, you must pick between the DATABASE or LOCAL choices

Example below
" 
    private MessageBoardDAO database = new MessageBoardDAO();
    protected MessageBoardLocal local = new MessageBoardLocal();
    /**
     * Select between DATABASE or LOCAL
     */
    private IDataAccessLayer selectedDAO = (use either "database" or "local" in here);
"
