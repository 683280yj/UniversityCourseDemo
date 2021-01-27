using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace test.Model
{
    public class UserInfo
    {
        public int ID { set; get; }
        public string UserName { set; get; }
        public string UserPass { set; get; }
        public DateTime Regtime { set; get; }
        public string Email { set; get; }
    }
}