media
@media (min-width: 1200px) {
  .navmenu {
    padding: 0;
  }
  .navmenu ul {
    margin: 0;
    padding: 0;
    list-style: none;
  }
  .navmenu li {
    position: relative;
  }
  .navmenu a,
  .navmenu a:focus {
    padding: 18px 15px;
    font-size: 16px;
    font-weight: 400;
    display: flex;
    align-items: center;
    justify-content: space-between;
    white-space: nowrap;
    transition: 0.3s;
  }
  .navmenu a i,
  .navmenu a:focus i {
    font-size: 12px;
    line-height: 0;
    margin-left: 5px;
    transition: 0.3s;
  }
  .navmenu .dropdown ul {
    padding: 10px 0;
    display: block;
    position: absolute;
    visibility: hidden;
    left: 14px;
    top: 130%;
    opacity: 0;
    transition: 0.3s;
    border-radius: 4px;
    z-index: 99;
    box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.1);
    background-color: rgb(244, 235, 235);
  }
  .navmenu .dropdown ul li {
    min-width: 200px;
  }
  .navmenu .dropdown ul a {
    padding: 10px 20px;
    font-size: 15px;
    text-transform: none;
  }
  .navmenu .dropdown ul a i {
    font-size: 12px;
  }
  .navmenu .dropdown:hover > ul {
    opacity: 1;
    top: 100%;
    visibility: visible;
  }
  .navmenu .dropdown .dropdown ul {
    top: 0;
    left: -90%;
    visibility: hidden;
  }
  .navmenu .dropdown .dropdown:hover > ul {
    opacity: 1;
    top: 0;
    left: -100%;
    visibility: visible;
  }
}
/* Navmenu - Mobile */
@media (max-width: 1199px) {
  .mobile-nav-toggle {
    color: white;
    font-size: 28px;
    line-height: 0;
    margin-right: 10px;
    cursor: pointer;
    transition: color 0.3s;
  }
  .navmenu {
    padding: 0;
    z-index: 9997;
  }
  .navmenu ul {
    /* changes bg white to this */
    background-color: rgba(242, 239, 239, 0.358);
    display: none;
    list-style: none;
    position: absolute;
    inset: 60px 20px 20px 20px;
    padding: 10px 0;
    margin: 0;
    border-radius: 6px;
    overflow-y: auto;
    transition: 0.3s;
    z-index: 9998;
    box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.1);
  }
  .navmenu a,
  .navmenu a:focus {
    padding: 10px 20px;
    font-size: 17px;
    font-weight: 500;
    display: flex;
    align-items: center;
    justify-content: space-between;
    white-space: nowrap;
    transition: 0.3s;
  }
  .navmenu a i,
  .navmenu a:focus i {
    font-size: 12px;
    line-height: 0;
    margin-left: 5px;
    width: 30px;
    height: 30px;
    display: flex;
    align-items: center;
    justify-content: center;
    border-radius: 50%;
    transition: 0.3s;
  }
  .navmenu .active i,
  .navmenu .active:focus i {
    transform: rotate(180deg);
  }
  .navmenu .dropdown ul {
    position: static;
    display: none;
    z-index: 99;
    padding: 10px 0;
    margin: 10px 20px;
    box-shadow: none;
    transition: all 0.5s ease-in-out;
  }
  .navmenu .dropdown ul ul {
    background-color: rgba(33, 37, 41, 0.1);
  }
  .navmenu .dropdown > .dropdown-active {
    display: block;
    background-color: rgba(33, 37, 41, 0.03);
  }
  .mobile-nav-active {
    overflow: hidden;
  }
  .mobile-nav-active .mobile-nav-toggle {
    color: #fff;
    position: absolute;
    font-size: 32px;
    top: 15px;
    right: 15px;
    margin-right: 0;
    z-index: 9999;
  }
  .mobile-nav-active .navmenu {
    position: fixed;
    overflow: hidden;
    inset: 0;
    background: rgba(33, 37, 41, 0.8);
    transition: 0.3s;
  }
  .mobile-nav-active .navmenu > ul {
    display: block;
  }
}
