import { Component } from '@angular/core';

import { Platform } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html'
})
export class AppComponent {
  public appPages = [
    {
      title: 'Home',
      url: '/home',
      icon: 'home'
    },
    {
      title: 'Lista de filmes',
      url: '/list/0',
      icon: 'list'
    },
    {
      title: 'Cadastrar Filmes',
      url: '/filme/0',
      icon: 'md-videocam'
    },
    {
      title: 'Lista de atores',
      url: '/list/1',
      icon: 'md-contacts'
    },
    {
      title: 'Cadastrar Atores',
      url: '/ator/0',
      icon: 'md-contact'
    },
    {
      title: 'Lista de diretores',
      url: '/list/2',
      icon: 'md-people'
    },
    {
      title: 'Cadastrar diretores',
      url: '/diretor/0',
      icon: 'md-person-add'
    },
    {
      title: 'Lista de generos',
      url: '/list/3',
      icon: 'md-paper'
    },
    {
      title: 'Cadastrar genero',
      url: '/genero/0',
      icon: 'md-podium'
    }
  ];

  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar
  ) {
    this.initializeApp();
  }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }
}
