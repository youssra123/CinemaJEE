import { TestBed } from '@angular/core/testing';

import { ServiceVillesService } from './service-villes.service';

describe('ServiceVillesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceVillesService = TestBed.get(ServiceVillesService);
    expect(service).toBeTruthy();
  });
});
