package brogrammers.com.tequiero;




    public class InstantMessage
    {
        private String author;
        private String message;

        public  InstantMessage()
        {

        }
        public  InstantMessage( String message,String author)
        {
            this.message=message;
            this.author=author;
        }

        public String getAuthor()
        {
            return author;
        }
        public String getMessage()
        {
            return message;
        }
    }

