package com.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color> colors;
        private Set<Finance> finance;
        private Collection<ScreenSizes> screensizes;
        private Set<OS> os;
        
        public EProduct() {
                
        }
        
        
        public Collection<ScreenSizes> getScreensizes() {
			return screensizes;
		}


        public void setScreensizes(Collection<ScreenSizes> screensizes) {
			this.screensizes = screensizes;
		}


        public Set<OS> getOs() {
			return os;
		}


        public void setOs(Set<OS> os) {
			this.os = os;
		}


		public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public List<Color> getColors() { return this.colors;}
        public Set<Finance> getFinance() { return this.finance;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        public void setColors(List<Color> colors) { this.colors = colors;}
        public void setFinance(Set<Finance> finance) { this.finance = finance;}
}
