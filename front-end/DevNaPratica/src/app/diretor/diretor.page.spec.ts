import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiretorPage } from './diretor.page';

describe('DiretorPage', () => {
  let component: DiretorPage;
  let fixture: ComponentFixture<DiretorPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiretorPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiretorPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
