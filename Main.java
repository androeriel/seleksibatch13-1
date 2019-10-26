public string GetBiodata(string Nama_, int Usia_)
        {
            List<Biodata> bio_ = new List<Biodata>();
            List<List_school> schl = new List<List_school>();
            List<Skills> skll = new List<Skills>();
            skll.Add(new Skills { sklill_name = "Java", level = "advanced" });
            skll.Add(new Skills { sklill_name = "Cisco", level = "advanced" });
            skll.Add(new Skills { sklill_name = "Mobile Development", level = "advanced" });
            schl.Add(new List_school { name = "SMA Negeri 1 Medan", year_in = "2013", year_out = "2016", major = "Tidak ada bro" });
            schl.Add(new List_school { name = "Universitas Bina Nusantara", year_in = "2016", year_out = "2019", major = "Sistem Informasi" });
            string[] hobi = { "Swimming", "Playing Game" };
            bio_.Add(new Biodata { name = Nama_, age = Usia_, address = "Jl Napitulupu Jambu No.2", hobbies = hobi, is_married = false, list_school = schl, skills = skll, interest_in_coding = true });
            string sJSONResponse = JsonConvert.SerializeObject(bio_);
            return sJSONResponse;
        }
        public class List_school
        {
            public string name { get; set; }
            public string year_in { get; set; }
            public string year_out { get; set; }
            public string major { get; set; }
        }
        public class Skills
        {
            public string sklill_name { get; set; }
            public string level { get; set; }
        }
        public class Biodata
        {
            public string name { get; set; }
            public int age { get; set; }
            public string address { get; set; }
            public string[] hobbies { get; set; }
            public bool is_married { get; set; }
            public List<List_school> list_school { get; set; }
            public List<Skills> skills { get; set; }
            public bool interest_in_coding { get; set; }
        }